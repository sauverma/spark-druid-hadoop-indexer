package com.atom.enrichers.util

import org.apache.log4j.Logger

trait LogHelper {
  val loggerName = this.getClass.getName
  lazy val logger = Logger.getLogger(loggerName)
}