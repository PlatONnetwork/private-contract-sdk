// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SimpleProtoLite1.proto

package com.abc.simpleproto1;

public final class SimpleProtoLite1 {
  private SimpleProtoLite1() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }
  public interface PointOrBuilder extends
      // @@protoc_insertion_point(interface_extends:simpleproto1.Point)
      com.google.protobuf.MessageLiteOrBuilder {

    /**
     * <code>int32 x = 1;</code>
     */
    int getX();

    /**
     * <code>int32 y = 2;</code>
     */
    int getY();
  }
  /**
   * Protobuf type {@code simpleproto1.Point}
   */
  public  static final class Point extends
      com.google.protobuf.GeneratedMessageLite<
          Point, Point.Builder> implements
      // @@protoc_insertion_point(message_implements:simpleproto1.Point)
      PointOrBuilder {
    private Point() {
    }
    public static final int X_FIELD_NUMBER = 1;
    private int x_;
    /**
     * <code>int32 x = 1;</code>
     */
    public int getX() {
      return x_;
    }
    /**
     * <code>int32 x = 1;</code>
     */
    private void setX(int value) {
      
      x_ = value;
    }
    /**
     * <code>int32 x = 1;</code>
     */
    private void clearX() {
      
      x_ = 0;
    }

    public static final int Y_FIELD_NUMBER = 2;
    private int y_;
    /**
     * <code>int32 y = 2;</code>
     */
    public int getY() {
      return y_;
    }
    /**
     * <code>int32 y = 2;</code>
     */
    private void setY(int value) {
      
      y_ = value;
    }
    /**
     * <code>int32 y = 2;</code>
     */
    private void clearY() {
      
      y_ = 0;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (x_ != 0) {
        output.writeInt32(1, x_);
      }
      if (y_ != 0) {
        output.writeInt32(2, y_);
      }
      unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (x_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, x_);
      }
      if (y_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, y_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    public static com.abc.simpleproto1.SimpleProtoLite1.Point parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static com.abc.simpleproto1.SimpleProtoLite1.Point parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static com.abc.simpleproto1.SimpleProtoLite1.Point parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static com.abc.simpleproto1.SimpleProtoLite1.Point parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static com.abc.simpleproto1.SimpleProtoLite1.Point parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static com.abc.simpleproto1.SimpleProtoLite1.Point parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static com.abc.simpleproto1.SimpleProtoLite1.Point parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static com.abc.simpleproto1.SimpleProtoLite1.Point parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static com.abc.simpleproto1.SimpleProtoLite1.Point parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }
    public static com.abc.simpleproto1.SimpleProtoLite1.Point parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static com.abc.simpleproto1.SimpleProtoLite1.Point parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static com.abc.simpleproto1.SimpleProtoLite1.Point parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
      return (Builder) DEFAULT_INSTANCE.createBuilder();
    }
    public static Builder newBuilder(com.abc.simpleproto1.SimpleProtoLite1.Point prototype) {
      return (Builder) DEFAULT_INSTANCE.createBuilder(prototype);
    }

    /**
     * Protobuf type {@code simpleproto1.Point}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageLite.Builder<
          com.abc.simpleproto1.SimpleProtoLite1.Point, Builder> implements
        // @@protoc_insertion_point(builder_implements:simpleproto1.Point)
        com.abc.simpleproto1.SimpleProtoLite1.PointOrBuilder {
      // Construct using com.abc.simpleproto1.SimpleProtoLite1.Point.newBuilder()
      private Builder() {
        super(DEFAULT_INSTANCE);
      }


      /**
       * <code>int32 x = 1;</code>
       */
      public int getX() {
        return instance.getX();
      }
      /**
       * <code>int32 x = 1;</code>
       */
      public Builder setX(int value) {
        copyOnWrite();
        instance.setX(value);
        return this;
      }
      /**
       * <code>int32 x = 1;</code>
       */
      public Builder clearX() {
        copyOnWrite();
        instance.clearX();
        return this;
      }

      /**
       * <code>int32 y = 2;</code>
       */
      public int getY() {
        return instance.getY();
      }
      /**
       * <code>int32 y = 2;</code>
       */
      public Builder setY(int value) {
        copyOnWrite();
        instance.setY(value);
        return this;
      }
      /**
       * <code>int32 y = 2;</code>
       */
      public Builder clearY() {
        copyOnWrite();
        instance.clearY();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:simpleproto1.Point)
    }
    @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
    protected final java.lang.Object dynamicMethod(
        com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
        java.lang.Object arg0, java.lang.Object arg1) {
      switch (method) {
        case NEW_MUTABLE_INSTANCE: {
          return new com.abc.simpleproto1.SimpleProtoLite1.Point();
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
          com.abc.simpleproto1.SimpleProtoLite1.Point other = (com.abc.simpleproto1.SimpleProtoLite1.Point) arg1;
          x_ = visitor.visitInt(x_ != 0, x_,
              other.x_ != 0, other.x_);
          y_ = visitor.visitInt(y_ != 0, y_,
              other.y_ != 0, other.y_);
          if (visitor == com.google.protobuf.GeneratedMessageLite.MergeFromVisitor
              .INSTANCE) {
          }
          return this;
        }
        case MERGE_FROM_STREAM: {
          com.google.protobuf.CodedInputStream input =
              (com.google.protobuf.CodedInputStream) arg0;
          com.google.protobuf.ExtensionRegistryLite extensionRegistry =
              (com.google.protobuf.ExtensionRegistryLite) arg1;
          if (extensionRegistry == null) {
            throw new java.lang.NullPointerException();
          }
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
                case 8: {

                  x_ = input.readInt32();
                  break;
                }
                case 16: {

                  y_ = input.readInt32();
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
        // fall through
        case GET_DEFAULT_INSTANCE: {
          return DEFAULT_INSTANCE;
        }
        case GET_PARSER: {
          if (PARSER == null) {    synchronized (com.abc.simpleproto1.SimpleProtoLite1.Point.class) {
              if (PARSER == null) {
                PARSER = new DefaultInstanceBasedParser(DEFAULT_INSTANCE);
              }
            }
          }
          return PARSER;
      }
      case GET_MEMOIZED_IS_INITIALIZED: {
        return (byte) 1;
      }
      case SET_MEMOIZED_IS_INITIALIZED: {
        return null;
      }
      }
      throw new UnsupportedOperationException();
    }


    // @@protoc_insertion_point(class_scope:simpleproto1.Point)
    private static final com.abc.simpleproto1.SimpleProtoLite1.Point DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new Point();
      DEFAULT_INSTANCE.makeImmutable();
    }

    public static com.abc.simpleproto1.SimpleProtoLite1.Point getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static volatile com.google.protobuf.Parser<Point> PARSER;

    public static com.google.protobuf.Parser<Point> parser() {
      return DEFAULT_INSTANCE.getParserForType();
    }
  }


  static {
  }

  // @@protoc_insertion_point(outer_class_scope)
}