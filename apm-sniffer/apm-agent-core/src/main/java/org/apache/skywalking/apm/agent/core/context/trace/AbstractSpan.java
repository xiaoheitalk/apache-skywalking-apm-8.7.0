/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package org.apache.skywalking.apm.agent.core.context.trace;

import org.apache.skywalking.apm.agent.core.context.AsyncSpan;
import org.apache.skywalking.apm.agent.core.context.tag.AbstractTag;
import org.apache.skywalking.apm.network.trace.component.Component;
import org.apache.skywalking.apm.network.trace.component.ComponentsDefine;

import java.util.Map;

/**
 * AbstractSpan定义了Span的骨架
 * The <code>AbstractSpan</code> represents the span's skeleton, which contains all open methods.
 */
public interface AbstractSpan extends AsyncSpan {
    /**
     * Set the component id, which defines in {@link ComponentsDefine}
     * 指定当前span表示的操作发生在哪个插件上
     *
     * @return the span for chaining.
     */
    AbstractSpan setComponent(Component component);

    /**
     * 指定当前span表示的操作所在的插件属于哪一种skywalking划分的类型
     *
     * @param layer
     * @return
     */
    AbstractSpan setLayer(SpanLayer layer);


    /**
     * Set a key:value tag on the Span.
     *
     * @return this Span instance, for chaining
     * @deprecated use {@link #tag(AbstractTag, String)} in companion with {@link Tags#ofKey(String)} instead
     */
    @Deprecated
    AbstractSpan tag(String key, String value);

    /**
     * span上打标签
     */
    AbstractSpan tag(AbstractTag<?> tag, String value);

    /**
     * 记录异常,时间使用当前本地时间
     * Record an exception event of the current walltime timestamp.
     * wallTime:挂钟时间,本地时间
     * serverTime:服务器时间
     *
     * @param t any subclass of {@link Throwable}, which occurs in this span.
     * @return the Span, for chaining
     */
    AbstractSpan log(Throwable t);

    AbstractSpan errorOccurred();

    /**
     * 是否是entry span
     *
     * @return true if the actual span is an entry span.
     */
    boolean isEntry();

    /**
     * 是否是exit span
     *
     * @return true if the actual span is an exit span.
     */
    boolean isExit();

    /**
     * 记录指定时间发生的事件
     * Record an event at a specific timestamp.
     *
     * @param timestamp The explicit timestamp for the log record.
     * @param event     the events
     * @return the Span, for chaining
     */
    AbstractSpan log(long timestamp, Map<String, ?> event);

    /**
     * Sets the string name for the logical operation this span represents.
     * 如果当前span的操作是:
     * 一个http请求,那么operationName就是请求的url
     * 一条sql语句,那么operationName就是sql
     * 一个redis操作,那么operationName就是redis命令
     *
     * @return this Span instance, for chaining
     */
    AbstractSpan setOperationName(String operationName);

    /**
     * Start a span.
     *
     * @return this Span instance, for chaining
     */
    AbstractSpan start();

    /**
     * Get the id of span
     *
     * @return id value.
     */
    int getSpanId();

    String getOperationName();

    /**
     * Reference other trace segment.
     *
     * @param ref segment ref
     */
    void ref(TraceSegmentRef ref);

    AbstractSpan start(long startTime);

    /**
     * 什么叫peer,就是对端地址
     * 一个请求可能跨多个进程,操作多种中间件,那么每一次RPC,对面的服务的地址就是remotePeer
     * 每一次中间件的操作,中间件的地址就是remotePeer
     *
     * @param remotePeer
     * @return
     */
    AbstractSpan setPeer(String remotePeer);

    /**
     * @return true if the span's owner(tracing context main thread) is been profiled.
     */
    boolean isProfiling();

    /**
     * Should skip analysis in the backend.
     */
    void skipAnalysis();
}
