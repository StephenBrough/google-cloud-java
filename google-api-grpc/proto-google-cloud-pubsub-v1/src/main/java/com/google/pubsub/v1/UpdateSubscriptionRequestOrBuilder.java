// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/pubsub/v1/pubsub.proto

package com.google.pubsub.v1;

public interface UpdateSubscriptionRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.pubsub.v1.UpdateSubscriptionRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The updated subscription object.
   * </pre>
   *
   * <code>.google.pubsub.v1.Subscription subscription = 1;</code>
   */
  boolean hasSubscription();
  /**
   * <pre>
   * The updated subscription object.
   * </pre>
   *
   * <code>.google.pubsub.v1.Subscription subscription = 1;</code>
   */
  com.google.pubsub.v1.Subscription getSubscription();
  /**
   * <pre>
   * The updated subscription object.
   * </pre>
   *
   * <code>.google.pubsub.v1.Subscription subscription = 1;</code>
   */
  com.google.pubsub.v1.SubscriptionOrBuilder getSubscriptionOrBuilder();

  /**
   * <pre>
   * Indicates which fields in the provided subscription to update.
   * Must be specified and non-empty.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   */
  boolean hasUpdateMask();
  /**
   * <pre>
   * Indicates which fields in the provided subscription to update.
   * Must be specified and non-empty.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   */
  com.google.protobuf.FieldMask getUpdateMask();
  /**
   * <pre>
   * Indicates which fields in the provided subscription to update.
   * Must be specified and non-empty.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();
}
