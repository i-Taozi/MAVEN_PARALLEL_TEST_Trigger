/**
 * Copyright (C) 2012 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package co.jirm.orm.builder;

import co.jirm.orm.builder.Condition.CombineType;


public class PropertyPath<T extends Condition<T>> extends AbstractField<T> {
	
	private PropertyPath(String propertyPath, T condition, CombineType combineType) {
		super(propertyPath, condition, combineType);
	}
	
	public static <T extends Condition<T>> PropertyPath<T> newPropertyPath(
			String propertyPath, 
			T condition, 
			CombineType combineType) {
		return new PropertyPath<T>(propertyPath, condition, combineType);
	}

	@Override
	protected String sqlPath() {
		return "{{" + propertyPath + "}}";
	}
}