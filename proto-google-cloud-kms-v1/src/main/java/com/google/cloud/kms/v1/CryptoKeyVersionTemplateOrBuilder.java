/*
 * Copyright 2019 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/kms/v1/resources.proto

package com.google.cloud.kms.v1;

public interface CryptoKeyVersionTemplateOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.kms.v1.CryptoKeyVersionTemplate)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * [ProtectionLevel][google.cloud.kms.v1.ProtectionLevel] to use when creating a [CryptoKeyVersion][google.cloud.kms.v1.CryptoKeyVersion] based on
   * this template. Immutable. Defaults to [SOFTWARE][google.cloud.kms.v1.ProtectionLevel.SOFTWARE].
   * </pre>
   *
   * <code>.google.cloud.kms.v1.ProtectionLevel protection_level = 1;</code>
   *
   * @return The enum numeric value on the wire for protectionLevel.
   */
  int getProtectionLevelValue();
  /**
   *
   *
   * <pre>
   * [ProtectionLevel][google.cloud.kms.v1.ProtectionLevel] to use when creating a [CryptoKeyVersion][google.cloud.kms.v1.CryptoKeyVersion] based on
   * this template. Immutable. Defaults to [SOFTWARE][google.cloud.kms.v1.ProtectionLevel.SOFTWARE].
   * </pre>
   *
   * <code>.google.cloud.kms.v1.ProtectionLevel protection_level = 1;</code>
   *
   * @return The protectionLevel.
   */
  com.google.cloud.kms.v1.ProtectionLevel getProtectionLevel();

  /**
   *
   *
   * <pre>
   * Required. [Algorithm][google.cloud.kms.v1.CryptoKeyVersion.CryptoKeyVersionAlgorithm] to use
   * when creating a [CryptoKeyVersion][google.cloud.kms.v1.CryptoKeyVersion] based on this template.
   * For backwards compatibility, GOOGLE_SYMMETRIC_ENCRYPTION is implied if both
   * this field is omitted and [CryptoKey.purpose][google.cloud.kms.v1.CryptoKey.purpose] is
   * [ENCRYPT_DECRYPT][google.cloud.kms.v1.CryptoKey.CryptoKeyPurpose.ENCRYPT_DECRYPT].
   * </pre>
   *
   * <code>.google.cloud.kms.v1.CryptoKeyVersion.CryptoKeyVersionAlgorithm algorithm = 3;</code>
   *
   * @return The enum numeric value on the wire for algorithm.
   */
  int getAlgorithmValue();
  /**
   *
   *
   * <pre>
   * Required. [Algorithm][google.cloud.kms.v1.CryptoKeyVersion.CryptoKeyVersionAlgorithm] to use
   * when creating a [CryptoKeyVersion][google.cloud.kms.v1.CryptoKeyVersion] based on this template.
   * For backwards compatibility, GOOGLE_SYMMETRIC_ENCRYPTION is implied if both
   * this field is omitted and [CryptoKey.purpose][google.cloud.kms.v1.CryptoKey.purpose] is
   * [ENCRYPT_DECRYPT][google.cloud.kms.v1.CryptoKey.CryptoKeyPurpose.ENCRYPT_DECRYPT].
   * </pre>
   *
   * <code>.google.cloud.kms.v1.CryptoKeyVersion.CryptoKeyVersionAlgorithm algorithm = 3;</code>
   *
   * @return The algorithm.
   */
  com.google.cloud.kms.v1.CryptoKeyVersion.CryptoKeyVersionAlgorithm getAlgorithm();
}
