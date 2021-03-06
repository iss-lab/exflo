// automatically generated by the FlatBuffers compiler, do not modify

package io.exflo.domain.fb.events;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

@SuppressWarnings("unused")
public final class FungibleTransfer extends Table {
  public static FungibleTransfer getRootAsFungibleTransfer(ByteBuffer _bb) { return getRootAsFungibleTransfer(_bb, new FungibleTransfer()); }
  public static FungibleTransfer getRootAsFungibleTransfer(ByteBuffer _bb, FungibleTransfer obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { bb_pos = _i; bb = _bb; vtable_start = bb_pos - bb.getInt(bb_pos); vtable_size = bb.getShort(vtable_start); }
  public FungibleTransfer __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public io.exflo.domain.fb.Bytes20 contract() { return contract(new io.exflo.domain.fb.Bytes20()); }
  public io.exflo.domain.fb.Bytes20 contract(io.exflo.domain.fb.Bytes20 obj) { int o = __offset(4); return o != 0 ? obj.__assign(__indirect(o + bb_pos), bb) : null; }
  public io.exflo.domain.fb.Bytes20 from() { return from(new io.exflo.domain.fb.Bytes20()); }
  public io.exflo.domain.fb.Bytes20 from(io.exflo.domain.fb.Bytes20 obj) { int o = __offset(6); return o != 0 ? obj.__assign(__indirect(o + bb_pos), bb) : null; }
  public io.exflo.domain.fb.Bytes20 to() { return to(new io.exflo.domain.fb.Bytes20()); }
  public io.exflo.domain.fb.Bytes20 to(io.exflo.domain.fb.Bytes20 obj) { int o = __offset(8); return o != 0 ? obj.__assign(__indirect(o + bb_pos), bb) : null; }
  public io.exflo.domain.fb.UInt256 value() { return value(new io.exflo.domain.fb.UInt256()); }
  public io.exflo.domain.fb.UInt256 value(io.exflo.domain.fb.UInt256 obj) { int o = __offset(10); return o != 0 ? obj.__assign(__indirect(o + bb_pos), bb) : null; }

  public static int createFungibleTransfer(FlatBufferBuilder builder,
      int contractOffset,
      int fromOffset,
      int toOffset,
      int valueOffset) {
    builder.startObject(4);
    FungibleTransfer.addValue(builder, valueOffset);
    FungibleTransfer.addTo(builder, toOffset);
    FungibleTransfer.addFrom(builder, fromOffset);
    FungibleTransfer.addContract(builder, contractOffset);
    return FungibleTransfer.endFungibleTransfer(builder);
  }

  public static void startFungibleTransfer(FlatBufferBuilder builder) { builder.startObject(4); }
  public static void addContract(FlatBufferBuilder builder, int contractOffset) { builder.addOffset(0, contractOffset, 0); }
  public static void addFrom(FlatBufferBuilder builder, int fromOffset) { builder.addOffset(1, fromOffset, 0); }
  public static void addTo(FlatBufferBuilder builder, int toOffset) { builder.addOffset(2, toOffset, 0); }
  public static void addValue(FlatBufferBuilder builder, int valueOffset) { builder.addOffset(3, valueOffset, 0); }
  public static int endFungibleTransfer(FlatBufferBuilder builder) {
    int o = builder.endObject();
    return o;
  }
}

