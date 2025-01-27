/**
 * Copyright 2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not
 * use this file except in compliance with the License. A copy of the License
 * is located at
 *
 *     http://aws.amazon.com/apache2.0/
 *
 * or in the "license" file accompanying this file. This file is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 *
 */

package com.amazon.deequ.comparison

sealed trait ComparisonResult

case class ComparisonFailed(errorMessage: String, ratio: Double = 0) extends ComparisonResult
case class ComparisonSucceeded(ratio: Double = 0) extends ComparisonResult

case class DataSynchronizationFailed(errorMessage: String, passedCount: Option[Long] = None,
                                     totalCount: Option[Long] = None) extends ComparisonResult
case class DataSynchronizationSucceeded(passedCount: Long, totalCount: Long) extends ComparisonResult
