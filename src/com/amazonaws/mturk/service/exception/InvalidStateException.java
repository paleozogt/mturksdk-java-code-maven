/*
 * Copyright 2007-2012 Amazon Technologies, Inc.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at:
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES
 * OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and
 * limitations under the License.
 */ 


package com.amazonaws.mturk.service.exception;


@SuppressWarnings("serial")
public class InvalidStateException extends ServiceException {

  public InvalidStateException() {
  }

  public InvalidStateException(String message) {
    super(message);
  }

  public InvalidStateException(Throwable cause) {
    super(cause);
  }

  public InvalidStateException(String message, Throwable cause) {
    super(message, cause);
  }

}
