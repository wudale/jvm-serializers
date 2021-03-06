// automatically generated, do not modify

package serializers.flatbuffers.media;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

@SuppressWarnings("unused")
public final class Image extends Table {
  public static Image getRootAsImage(ByteBuffer _bb) { return getRootAsImage(_bb, new Image()); }
  public static Image getRootAsImage(ByteBuffer _bb, Image obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__init(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public Image __init(int _i, ByteBuffer _bb) { bb_pos = _i; bb = _bb; return this; }

  public String uri() { int o = __offset(4); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer uriAsByteBuffer() { return __vector_as_bytebuffer(4, 1); }
  public String title() { int o = __offset(6); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer titleAsByteBuffer() { return __vector_as_bytebuffer(6, 1); }
  public int width() { int o = __offset(8); return o != 0 ? bb.getInt(o + bb_pos) : 0; }
  public int height() { int o = __offset(10); return o != 0 ? bb.getInt(o + bb_pos) : 0; }
  public byte size() { int o = __offset(12); return o != 0 ? bb.get(o + bb_pos) : 0; }

  public static int createImage(FlatBufferBuilder builder,
      int uriOffset,
      int titleOffset,
      int width,
      int height,
      byte size) {
    builder.startObject(5);
    Image.addHeight(builder, height);
    Image.addWidth(builder, width);
    Image.addTitle(builder, titleOffset);
    Image.addUri(builder, uriOffset);
    Image.addSize(builder, size);
    return Image.endImage(builder);
  }

  public static void startImage(FlatBufferBuilder builder) { builder.startObject(5); }
  public static void addUri(FlatBufferBuilder builder, int uriOffset) { builder.addOffset(0, uriOffset, 0); }
  public static void addTitle(FlatBufferBuilder builder, int titleOffset) { builder.addOffset(1, titleOffset, 0); }
  public static void addWidth(FlatBufferBuilder builder, int width) { builder.addInt(2, width, 0); }
  public static void addHeight(FlatBufferBuilder builder, int height) { builder.addInt(3, height, 0); }
  public static void addSize(FlatBufferBuilder builder, byte size) { builder.addByte(4, size, 0); }
  public static int endImage(FlatBufferBuilder builder) {
    int o = builder.endObject();
    builder.required(o, 4);  // uri
    return o;
  }
};

