/*
 * Copyright (C) 2011 aki@akjava.com
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
package com.akjava.gwt.html5.client.file;

import com.google.gwt.core.client.JsArray;
import com.google.gwt.dom.client.NativeEvent;
import com.google.gwt.user.client.Element;

public class FileUtils {

	public static final native JsArray<File> toFile(NativeEvent event)/*-{
    return event.target.files;
  }-*/;
	
	
	/*
	 * dont work yet
	 */
	public static final native void addDropListener(Element element,DropListener listener)/*-{
	element.addEventListener("dragenter", function(e){
	console.log("enter");	
	 if(e.preventDefault) { e.preventDefault(); }
                return false;
	}, false);
		
    element.addEventListener("drop",function(e){
    	e.preventDefault();
    	console.log("dropped");
    listener.@com.akjava.gwt.html5.client.file.DropListener::onDrop(Lcom/google/gwt/core/client/JsArray;)(e.dataTransfer.files);
     },false);
  }-*/;
	
	

}
