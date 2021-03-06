// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: schema.proto

package forfun.sandbox.uwns.shared.pack.proto;

public final class Packet {
  private Packet() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Message_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Message_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Vector_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Vector_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Actor_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Actor_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Agent_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Agent_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_EnterWorldResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_EnterWorldResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_TargetPositionRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_TargetPositionRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SnapshotResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SnapshotResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\014schema.proto\"\264\001\n\007Message\0223\n\024enter_worl" +
      "d_response\030i \001(\0132\023.EnterWorldResponseH\000\022" +
      "9\n\027target_position_request\030n \001(\0132\026.Targe" +
      "tPositionRequestH\000\022.\n\021snapshot_response\030" +
      "s \001(\0132\021.SnapshotResponseH\000B\t\n\007request\"\036\n" +
      "\006Vector\022\t\n\001x\030\002 \001(\002\022\t\n\001y\030\003 \001(\002\"?\n\005Actor\022\013" +
      "\n\003uid\030\001 \001(\005\022\016\n\006active\030\002 \001(\010\022\031\n\010position\030" +
      "\003 \001(\0132\007.Vector\"m\n\005Agent\022\013\n\003uid\030\001 \001(\005\022\021\n\t" +
      "target_id\030\002 \001(\005\022\016\n\006active\030\003 \001(\010\022\031\n\010posit" +
      "ion\030\004 \001(\0132\007.Vector\022\031\n\010velocity\030\005 \001(\0132\007.V",
      "ector\"!\n\022EnterWorldResponse\022\013\n\003uid\030\001 \001(\005" +
      "\"2\n\025TargetPositionRequest\022\031\n\010position\030\001 " +
      "\001(\0132\007.Vector\"q\n\020SnapshotResponse\022\016\n\006radi" +
      "us\030\001 \001(\002\022\027\n\007targets\030\002 \003(\0132\006.Actor\022\027\n\007pla" +
      "yers\030\003 \003(\0132\006.Agent\022\033\n\013non_players\030\004 \003(\0132" +
      "\006.AgentBS\n\036forfun.sandbox.uwns.pack.prot" +
      "oB\006PacketP\001\252\002&Forfun.Sandbox.Uwns.Client" +
      ".Sheme.Protob\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_Message_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Message_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Message_descriptor,
        new java.lang.String[] { "EnterWorldResponse", "TargetPositionRequest", "SnapshotResponse", "Request", });
    internal_static_Vector_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_Vector_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Vector_descriptor,
        new java.lang.String[] { "X", "Y", });
    internal_static_Actor_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_Actor_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Actor_descriptor,
        new java.lang.String[] { "Uid", "Active", "Position", });
    internal_static_Agent_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_Agent_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Agent_descriptor,
        new java.lang.String[] { "Uid", "TargetId", "Active", "Position", "Velocity", });
    internal_static_EnterWorldResponse_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_EnterWorldResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_EnterWorldResponse_descriptor,
        new java.lang.String[] { "Uid", });
    internal_static_TargetPositionRequest_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_TargetPositionRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_TargetPositionRequest_descriptor,
        new java.lang.String[] { "Position", });
    internal_static_SnapshotResponse_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_SnapshotResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SnapshotResponse_descriptor,
        new java.lang.String[] { "Radius", "Targets", "Players", "NonPlayers", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
