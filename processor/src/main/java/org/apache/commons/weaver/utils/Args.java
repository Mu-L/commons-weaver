/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements. See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership. The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.commons.weaver.utils;

public class Args {

    public static int compare(Class<?>[] paramTypes1, Class<?>[] paramTypes2) {
        int i = 0;
        while (i < paramTypes1.length) {
            if (i >= paramTypes2.length) {
                return 1;
            }
            final int test = paramTypes1[i].getName().compareTo(paramTypes2[i].getName());
            if (test == 0) {
                continue;
            }
            return test;
        }
        if (paramTypes1.length == paramTypes2.length) {
            return 0;
        }
        return -1;
    }

}