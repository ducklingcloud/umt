/*
 * Copyright (c) 2008-2013 Computer Network Information Center (CNIC), Chinese Academy of Sciences.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License. 
 *
 */
package cn.vlabs.umt.validate.validator.impl;

import cn.vlabs.umt.common.util.CommonUtils;
import cn.vlabs.umt.validate.validator.Validator;

/**
 * 最小长度验证
 * @author lvly
 * @since 2013-1-21
 */
public class MinLengthValidator implements Validator{
	private int length;
	/**
	 * 构造方法
	 * @param length 最小长度
	 * */
	public MinLengthValidator(int length){
		this.length=length;
	}

	@Override
	public boolean validate(String value) {
		if(CommonUtils.isNull(value)){
			return false;
		}
		return value.length()>=length;
	}
	
}