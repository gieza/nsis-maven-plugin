/*
 * Copyright 2008 Codehaus
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
package org.digitalmediaserver.nsis.io;

/**
 * Generic handler for consuming ProcessOutput on a line by line basis.
 *
 * @version $Id: ProcessOutputConsumer.java 18289 2013-05-10 12:37:34Z rfscholte$
 * @author <a href="mailto:joakime@apache.org">Joakim Erdfelt</a>
 */
public interface ProcessOutputConsumer {

	/**
	 * Consume a line of output from the executing process.
	 *
	 * @param line the line of text to consume
	 */
	void consumeOutputLine(String line);
}