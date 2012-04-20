 /* Copyright 2012 Kristofer Mitchell

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.*/package model;
/**
 * A Singleton Model; needs to be filled in with implementation!
 * @author krm
 *
 */
public class Model extends AbstractModel {

	private static Model model;
		
	private Model(){
	}
	
	/**
	 * Provides Singleton access to the Model
	 * @return the Model
	 */
	public static Model getModel(){
		if (model == null)
			model = new Model();
		
		return model;
	}
	
	
	/**
	 * toString is a useful testing function
	 */
	public String toString(){
		return "";
	}
	
	
}

