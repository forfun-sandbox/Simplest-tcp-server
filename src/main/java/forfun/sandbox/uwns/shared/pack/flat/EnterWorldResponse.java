// automatically generated by the FlatBuffers compiler, do not modify

package forfun.sandbox.uwns.shared.pack.flat;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

@SuppressWarnings("unused")
public final class EnterWorldResponse extends Table {
  public static EnterWorldResponse getRootAsEnterWorldResponse(ByteBuffer _bb) { return getRootAsEnterWorldResponse(_bb, new EnterWorldResponse()); }
  public static EnterWorldResponse getRootAsEnterWorldResponse(ByteBuffer _bb, EnterWorldResponse obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { bb_pos = _i; bb = _bb; vtable_start = bb_pos - bb.getInt(bb_pos); vtable_size = bb.getShort(vtable_start); }
  public EnterWorldResponse __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public int uid() { int o = __offset(4); return o != 0 ? bb.getInt(o + bb_pos) : 0; }

  public static int createEnterWorldResponse(FlatBufferBuilder builder,
      int uid) {
    builder.startObject(1);
    EnterWorldResponse.addUid(builder, uid);
    return EnterWorldResponse.endEnterWorldResponse(builder);
  }

  public static void startEnterWorldResponse(FlatBufferBuilder builder) { builder.startObject(1); }
  public static void addUid(FlatBufferBuilder builder, int uid) { builder.addInt(0, uid, 0); }
  public static int endEnterWorldResponse(FlatBufferBuilder builder) {
    int o = builder.endObject();
    return o;
  }
}
