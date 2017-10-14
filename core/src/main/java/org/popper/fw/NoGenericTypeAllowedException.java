/*
 * Copyright [2013] [Michael Bulla, michaelbulla@gmail.com]
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.popper.fw;

import java.lang.reflect.Method;

public class NoGenericTypeAllowedException extends RuntimeException {
	public NoGenericTypeAllowedException(Method method) {
		super("Generic return types for interface methods are not allowed, but method " + method + " does. Replace the generic by overriding the method with the concrete return type");
	}
}