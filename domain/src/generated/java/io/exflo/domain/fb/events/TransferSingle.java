// automatically generated by the FlatBuffers compiler, do not modify

package io.exflo.domain.fb.events;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

@SuppressWarnings("unused")
public final class TransferSingle extends Table {
  public static TransferSingle getRootAsTransferSingle(ByteBuffer _bb) { return getRootAsTransferSingle(_bb, new TransferSingle()); }
  public static TransferSingle getRootAsTransferSingle(ByteBuffer _bb, TransferSingle obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { bb_pos = _i; bb = _bb; vtable_start = bb_pos - bb.getInt(bb_pos); vtable_size = bb.getShort(vtable_start); }
  public TransferSingle __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public io.exflo.domain.fb.Bytes20 contract() { return contract(new io.exflo.domain.fb.Bytes20()); }
  public io.exflo.domain.fb.Bytes20 contract(io.exflo.domain.fb.Bytes20 obj) { int o = __offset(4); return o != 0 ? obj.__assign(__indirect(o + bb_pos), bb) : null; }
  public io.exflo.domain.fb.Bytes20 operator() { return operator(new io.exflo.domain.fb.Bytes20()); }
  public io.exflo.domain.fb.Bytes20 operator(io.exflo.domain.fb.Bytes20 obj) { int o = __offset(6); return o != 0 ? obj.__assign(__indirect(o + bb_pos), bb) : null; }
  public io.exflo.domain.fb.Bytes20 from() { return from(new io.exflo.domain.fb.Bytes20()); }
  public io.exflo.domain.fb.Bytes20 from(io.exflo.domain.fb.Bytes20 obj) { int o = __offset(8); return o != 0 ? obj.__assign(__indirect(o + bb_pos), bb) : null; }
  public io.exflo.domain.fb.Bytes20 to() { return to(new io.exflo.domain.fb.Bytes20()); }
  public io.exflo.domain.fb.Bytes20 to(io.exflo.domain.fb.Bytes20 obj) { int o = __offset(10); return o != 0 ? obj.__assign(__indirect(o + bb_pos), bb) : null; }
  public io.exflo.domain.fb.UInt256 id() { return id(new io.exflo.domain.fb.UInt256()); }
  public io.exflo.domain.fb.UInt256 id(io.exflo.domain.fb.UInt256 obj) { int o = __offset(12); return o != 0 ? obj.__assign(__indirect(o + bb_pos), bb) : null; }
  public io.exflo.domain.fb.UInt256 value() { return value(new io.exflo.domain.fb.UInt256()); }
  public io.exflo.domain.fb.UInt256 value(io.exflo.domain.fb.UInt256 obj) { int o = __offset(14); return o != 0 ? obj.__assign(__indirect(o + bb_pos), bb) : null; }

  public static int createTransferSingle(FlatBufferBuilder builder,
      int contractOffset,
      int operatorOffset,
      int fromOffset,
      int toOffset,
      int idOffset,
      int valueOffset) {
    builder.startObject(6);
    TransferSingle.addValue(builder, valueOffset);
    TransferSingle.addId(builder, idOffset);
    TransferSingle.addTo(builder, toOffset);
    TransferSingle.addFrom(builder, fromOffset);
    TransferSingle.addOperator(builder, operatorOffset);
    TransferSingle.addContract(builder, contractOffset);
    return TransferSingle.endTransferSingle(builder);
  }

  public static void startTransferSingle(FlatBufferBuilder builder) { builder.startObject(6); }
  public static void addContract(FlatBufferBuilder builder, int contractOffset) { builder.addOffset(0, contractOffset, 0); }
  public static void addOperator(FlatBufferBuilder builder, int operatorOffset) { builder.addOffset(1, operatorOffset, 0); }
  public static void addFrom(FlatBufferBuilder builder, int fromOffset) { builder.addOffset(2, fromOffset, 0); }
  public static void addTo(FlatBufferBuilder builder, int toOffset) { builder.addOffset(3, toOffset, 0); }
  public static void addId(FlatBufferBuilder builder, int idOffset) { builder.addOffset(4, idOffset, 0); }
  public static void addValue(FlatBufferBuilder builder, int valueOffset) { builder.addOffset(5, valueOffset, 0); }
  public static int endTransferSingle(FlatBufferBuilder builder) {
    int o = builder.endObject();
    return o;
  }
}

