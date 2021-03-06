// Copyright (c) Microsoft. All rights reserved.

package com.microsoft.azure.iot.kafka.connect

case class IotMessage(content: String, systemProperties: scala.collection.mutable.Map[String, Object],
    properties: scala.collection.mutable.Map[String, String])