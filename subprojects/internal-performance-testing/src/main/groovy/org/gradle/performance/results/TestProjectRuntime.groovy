/*
 * Copyright 2020 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.gradle.performance.results

import com.fasterxml.jackson.annotation.JsonInclude
import groovy.transform.CompileStatic

/**
 * Used for generating performance-test-runtimes.json by Jackson.
 */
@CompileStatic
@JsonInclude(JsonInclude.Include.NON_NULL)
class TestProjectRuntime {
    String testProject
    Long linux
    Long windows
    Long macOs

    TestProjectRuntime(String testProject, Long linux, Long windows, Long macOs) {
        this.testProject = testProject
        this.linux = linux
        this.windows = windows
        this.macOs = macOs
    }
}
