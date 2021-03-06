// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: service.proto

package org.chromium.chrome.browser.autofill_assistant.proto;

/**
 * <pre>
 * Contain all arguments to perform a click.
 * </pre>
 *
 * Protobuf type {@code autofill_assistant.ClickProto}
 */
public  final class ClickProto extends
    com.google.protobuf.GeneratedMessageLite<
        ClickProto, ClickProto.Builder> implements
    // @@protoc_insertion_point(message_implements:autofill_assistant.ClickProto)
    ClickProtoOrBuilder {
  private ClickProto() {
  }
  private int bitField0_;
  public static final int ELEMENT_TO_CLICK_FIELD_NUMBER = 1;
  private org.chromium.chrome.browser.autofill_assistant.proto.ElementReferenceProto elementToClick_;
  /**
   * <code>optional .autofill_assistant.ElementReferenceProto element_to_click = 1;</code>
   */
  public boolean hasElementToClick() {
    return ((bitField0_ & 0x00000001) == 0x00000001);
  }
  /**
   * <code>optional .autofill_assistant.ElementReferenceProto element_to_click = 1;</code>
   */
  public org.chromium.chrome.browser.autofill_assistant.proto.ElementReferenceProto getElementToClick() {
    return elementToClick_ == null ? org.chromium.chrome.browser.autofill_assistant.proto.ElementReferenceProto.getDefaultInstance() : elementToClick_;
  }
  /**
   * <code>optional .autofill_assistant.ElementReferenceProto element_to_click = 1;</code>
   */
  private void setElementToClick(org.chromium.chrome.browser.autofill_assistant.proto.ElementReferenceProto value) {
    if (value == null) {
      throw new NullPointerException();
    }
    elementToClick_ = value;
    bitField0_ |= 0x00000001;
    }
  /**
   * <code>optional .autofill_assistant.ElementReferenceProto element_to_click = 1;</code>
   */
  private void setElementToClick(
      org.chromium.chrome.browser.autofill_assistant.proto.ElementReferenceProto.Builder builderForValue) {
    elementToClick_ = builderForValue.build();
    bitField0_ |= 0x00000001;
  }
  /**
   * <code>optional .autofill_assistant.ElementReferenceProto element_to_click = 1;</code>
   */
  private void mergeElementToClick(org.chromium.chrome.browser.autofill_assistant.proto.ElementReferenceProto value) {
    if (elementToClick_ != null &&
        elementToClick_ != org.chromium.chrome.browser.autofill_assistant.proto.ElementReferenceProto.getDefaultInstance()) {
      elementToClick_ =
        org.chromium.chrome.browser.autofill_assistant.proto.ElementReferenceProto.newBuilder(elementToClick_).mergeFrom(value).buildPartial();
    } else {
      elementToClick_ = value;
    }
    bitField0_ |= 0x00000001;
  }
  /**
   * <code>optional .autofill_assistant.ElementReferenceProto element_to_click = 1;</code>
   */
  private void clearElementToClick() {  elementToClick_ = null;
    bitField0_ = (bitField0_ & ~0x00000001);
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (((bitField0_ & 0x00000001) == 0x00000001)) {
      output.writeMessage(1, getElementToClick());
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSerializedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) == 0x00000001)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getElementToClick());
    }
    size += unknownFields.getSerializedSize();
    memoizedSerializedSize = size;
    return size;
  }

  public static org.chromium.chrome.browser.autofill_assistant.proto.ClickProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.ClickProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.ClickProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.ClickProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.ClickProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.ClickProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.ClickProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.ClickProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.ClickProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.ClickProto parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(org.chromium.chrome.browser.autofill_assistant.proto.ClickProto prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  /**
   * <pre>
   * Contain all arguments to perform a click.
   * </pre>
   *
   * Protobuf type {@code autofill_assistant.ClickProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        org.chromium.chrome.browser.autofill_assistant.proto.ClickProto, Builder> implements
      // @@protoc_insertion_point(builder_implements:autofill_assistant.ClickProto)
      org.chromium.chrome.browser.autofill_assistant.proto.ClickProtoOrBuilder {
    // Construct using org.chromium.chrome.browser.autofill_assistant.proto.ClickProto.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <code>optional .autofill_assistant.ElementReferenceProto element_to_click = 1;</code>
     */
    public boolean hasElementToClick() {
      return instance.hasElementToClick();
    }
    /**
     * <code>optional .autofill_assistant.ElementReferenceProto element_to_click = 1;</code>
     */
    public org.chromium.chrome.browser.autofill_assistant.proto.ElementReferenceProto getElementToClick() {
      return instance.getElementToClick();
    }
    /**
     * <code>optional .autofill_assistant.ElementReferenceProto element_to_click = 1;</code>
     */
    public Builder setElementToClick(org.chromium.chrome.browser.autofill_assistant.proto.ElementReferenceProto value) {
      copyOnWrite();
      instance.setElementToClick(value);
      return this;
      }
    /**
     * <code>optional .autofill_assistant.ElementReferenceProto element_to_click = 1;</code>
     */
    public Builder setElementToClick(
        org.chromium.chrome.browser.autofill_assistant.proto.ElementReferenceProto.Builder builderForValue) {
      copyOnWrite();
      instance.setElementToClick(builderForValue);
      return this;
    }
    /**
     * <code>optional .autofill_assistant.ElementReferenceProto element_to_click = 1;</code>
     */
    public Builder mergeElementToClick(org.chromium.chrome.browser.autofill_assistant.proto.ElementReferenceProto value) {
      copyOnWrite();
      instance.mergeElementToClick(value);
      return this;
    }
    /**
     * <code>optional .autofill_assistant.ElementReferenceProto element_to_click = 1;</code>
     */
    public Builder clearElementToClick() {  copyOnWrite();
      instance.clearElementToClick();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:autofill_assistant.ClickProto)
  }
  protected final Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      Object arg0, Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new org.chromium.chrome.browser.autofill_assistant.proto.ClickProto();
      }
      case IS_INITIALIZED: {
        return DEFAULT_INSTANCE;
      }
      case MAKE_IMMUTABLE: {
        return null;
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case VISIT: {
        Visitor visitor = (Visitor) arg0;
        org.chromium.chrome.browser.autofill_assistant.proto.ClickProto other = (org.chromium.chrome.browser.autofill_assistant.proto.ClickProto) arg1;
        elementToClick_ = visitor.visitMessage(elementToClick_, other.elementToClick_);
        if (visitor == com.google.protobuf.GeneratedMessageLite.MergeFromVisitor
            .INSTANCE) {
          bitField0_ |= other.bitField0_;
        }
        return this;
      }
      case MERGE_FROM_STREAM: {
        com.google.protobuf.CodedInputStream input =
            (com.google.protobuf.CodedInputStream) arg0;
        com.google.protobuf.ExtensionRegistryLite extensionRegistry =
            (com.google.protobuf.ExtensionRegistryLite) arg1;
        try {
          boolean done = false;
          while (!done) {
            int tag = input.readTag();
            switch (tag) {
              case 0:
                done = true;
                break;
              default: {
                if (!parseUnknownField(tag, input)) {
                  done = true;
                }
                break;
              }
              case 10: {
                org.chromium.chrome.browser.autofill_assistant.proto.ElementReferenceProto.Builder subBuilder = null;
                if (((bitField0_ & 0x00000001) == 0x00000001)) {
                  subBuilder = elementToClick_.toBuilder();
                }
                elementToClick_ = input.readMessage(org.chromium.chrome.browser.autofill_assistant.proto.ElementReferenceProto.parser(), extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(elementToClick_);
                  elementToClick_ = subBuilder.buildPartial();
                }
                bitField0_ |= 0x00000001;
                break;
              }
            }
          }
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw new RuntimeException(e.setUnfinishedMessage(this));
        } catch (java.io.IOException e) {
          throw new RuntimeException(
              new com.google.protobuf.InvalidProtocolBufferException(
                  e.getMessage()).setUnfinishedMessage(this));
        } finally {
        }
      }
      case GET_DEFAULT_INSTANCE: {
        return DEFAULT_INSTANCE;
      }
      case GET_PARSER: {
        if (PARSER == null) {    synchronized (org.chromium.chrome.browser.autofill_assistant.proto.ClickProto.class) {
            if (PARSER == null) {
              PARSER = new DefaultInstanceBasedParser(DEFAULT_INSTANCE);
            }
          }
        }
        return PARSER;
      }
    }
    throw new UnsupportedOperationException();
  }


  // @@protoc_insertion_point(class_scope:autofill_assistant.ClickProto)
  private static final org.chromium.chrome.browser.autofill_assistant.proto.ClickProto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ClickProto();
    DEFAULT_INSTANCE.makeImmutable();
  }

  public static org.chromium.chrome.browser.autofill_assistant.proto.ClickProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<ClickProto> PARSER;

  public static com.google.protobuf.Parser<ClickProto> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

