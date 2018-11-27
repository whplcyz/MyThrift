/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.whp.demo.thrift.optional;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.11.0)", date = "2018-11-26")
public class Car implements org.apache.thrift.TBase<Car, Car._Fields>, java.io.Serializable, Cloneable, Comparable<Car> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("Car");

  private static final org.apache.thrift.protocol.TField CAR_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("carId", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField CAR_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("carName", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField PRICE_FIELD_DESC = new org.apache.thrift.protocol.TField("price", org.apache.thrift.protocol.TType.I64, (short)3);
  private static final org.apache.thrift.protocol.TField AGE_FIELD_DESC = new org.apache.thrift.protocol.TField("age", org.apache.thrift.protocol.TType.I16, (short)4);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new CarStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new CarTupleSchemeFactory();

  public int carId; // required
  public java.lang.String carName; // required
  public long price; // required
  public short age; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    CAR_ID((short)1, "carId"),
    CAR_NAME((short)2, "carName"),
    PRICE((short)3, "price"),
    AGE((short)4, "age");

    private static final java.util.Map<java.lang.String, _Fields> byName = new java.util.HashMap<java.lang.String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // CAR_ID
          return CAR_ID;
        case 2: // CAR_NAME
          return CAR_NAME;
        case 3: // PRICE
          return PRICE;
        case 4: // AGE
          return AGE;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new java.lang.IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(java.lang.String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final java.lang.String _fieldName;

    _Fields(short thriftId, java.lang.String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public java.lang.String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __CARID_ISSET_ID = 0;
  private static final int __PRICE_ISSET_ID = 1;
  private static final int __AGE_ISSET_ID = 2;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.AGE};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.CAR_ID, new org.apache.thrift.meta_data.FieldMetaData("carId", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.CAR_NAME, new org.apache.thrift.meta_data.FieldMetaData("carName", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.PRICE, new org.apache.thrift.meta_data.FieldMetaData("price", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.AGE, new org.apache.thrift.meta_data.FieldMetaData("age", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I16)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(Car.class, metaDataMap);
  }

  public Car() {
    this.age = (short)0;

  }

  public Car(
    int carId,
    java.lang.String carName,
    long price)
  {
    this();
    this.carId = carId;
    setCarIdIsSet(true);
    this.carName = carName;
    this.price = price;
    setPriceIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Car(Car other) {
    __isset_bitfield = other.__isset_bitfield;
    this.carId = other.carId;
    if (other.isSetCarName()) {
      this.carName = other.carName;
    }
    this.price = other.price;
    this.age = other.age;
  }

  public Car deepCopy() {
    return new Car(this);
  }

  @Override
  public void clear() {
    setCarIdIsSet(false);
    this.carId = 0;
    this.carName = null;
    setPriceIsSet(false);
    this.price = 0;
    this.age = (short)0;

  }

  public int getCarId() {
    return this.carId;
  }

  public Car setCarId(int carId) {
    this.carId = carId;
    setCarIdIsSet(true);
    return this;
  }

  public void unsetCarId() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __CARID_ISSET_ID);
  }

  /** Returns true if field carId is set (has been assigned a value) and false otherwise */
  public boolean isSetCarId() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __CARID_ISSET_ID);
  }

  public void setCarIdIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __CARID_ISSET_ID, value);
  }

  public java.lang.String getCarName() {
    return this.carName;
  }

  public Car setCarName(java.lang.String carName) {
    this.carName = carName;
    return this;
  }

  public void unsetCarName() {
    this.carName = null;
  }

  /** Returns true if field carName is set (has been assigned a value) and false otherwise */
  public boolean isSetCarName() {
    return this.carName != null;
  }

  public void setCarNameIsSet(boolean value) {
    if (!value) {
      this.carName = null;
    }
  }

  public long getPrice() {
    return this.price;
  }

  public Car setPrice(long price) {
    this.price = price;
    setPriceIsSet(true);
    return this;
  }

  public void unsetPrice() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __PRICE_ISSET_ID);
  }

  /** Returns true if field price is set (has been assigned a value) and false otherwise */
  public boolean isSetPrice() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __PRICE_ISSET_ID);
  }

  public void setPriceIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __PRICE_ISSET_ID, value);
  }

  public short getAge() {
    return this.age;
  }

  public Car setAge(short age) {
    this.age = age;
    setAgeIsSet(true);
    return this;
  }

  public void unsetAge() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __AGE_ISSET_ID);
  }

  /** Returns true if field age is set (has been assigned a value) and false otherwise */
  public boolean isSetAge() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __AGE_ISSET_ID);
  }

  public void setAgeIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __AGE_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
    case CAR_ID:
      if (value == null) {
        unsetCarId();
      } else {
        setCarId((java.lang.Integer)value);
      }
      break;

    case CAR_NAME:
      if (value == null) {
        unsetCarName();
      } else {
        setCarName((java.lang.String)value);
      }
      break;

    case PRICE:
      if (value == null) {
        unsetPrice();
      } else {
        setPrice((java.lang.Long)value);
      }
      break;

    case AGE:
      if (value == null) {
        unsetAge();
      } else {
        setAge((java.lang.Short)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case CAR_ID:
      return getCarId();

    case CAR_NAME:
      return getCarName();

    case PRICE:
      return getPrice();

    case AGE:
      return getAge();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case CAR_ID:
      return isSetCarId();
    case CAR_NAME:
      return isSetCarName();
    case PRICE:
      return isSetPrice();
    case AGE:
      return isSetAge();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof Car)
      return this.equals((Car)that);
    return false;
  }

  public boolean equals(Car that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_carId = true;
    boolean that_present_carId = true;
    if (this_present_carId || that_present_carId) {
      if (!(this_present_carId && that_present_carId))
        return false;
      if (this.carId != that.carId)
        return false;
    }

    boolean this_present_carName = true && this.isSetCarName();
    boolean that_present_carName = true && that.isSetCarName();
    if (this_present_carName || that_present_carName) {
      if (!(this_present_carName && that_present_carName))
        return false;
      if (!this.carName.equals(that.carName))
        return false;
    }

    boolean this_present_price = true;
    boolean that_present_price = true;
    if (this_present_price || that_present_price) {
      if (!(this_present_price && that_present_price))
        return false;
      if (this.price != that.price)
        return false;
    }

    boolean this_present_age = true && this.isSetAge();
    boolean that_present_age = true && that.isSetAge();
    if (this_present_age || that_present_age) {
      if (!(this_present_age && that_present_age))
        return false;
      if (this.age != that.age)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + carId;

    hashCode = hashCode * 8191 + ((isSetCarName()) ? 131071 : 524287);
    if (isSetCarName())
      hashCode = hashCode * 8191 + carName.hashCode();

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(price);

    hashCode = hashCode * 8191 + ((isSetAge()) ? 131071 : 524287);
    if (isSetAge())
      hashCode = hashCode * 8191 + age;

    return hashCode;
  }

  @Override
  public int compareTo(Car other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetCarId()).compareTo(other.isSetCarId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCarId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.carId, other.carId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetCarName()).compareTo(other.isSetCarName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCarName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.carName, other.carName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetPrice()).compareTo(other.isSetPrice());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPrice()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.price, other.price);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetAge()).compareTo(other.isSetAge());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAge()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.age, other.age);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    scheme(iprot).read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    scheme(oprot).write(oprot, this);
  }

  @Override
  public java.lang.String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder("Car(");
    boolean first = true;

    sb.append("carId:");
    sb.append(this.carId);
    first = false;
    if (!first) sb.append(", ");
    sb.append("carName:");
    if (this.carName == null) {
      sb.append("null");
    } else {
      sb.append(this.carName);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("price:");
    sb.append(this.price);
    first = false;
    if (isSetAge()) {
      if (!first) sb.append(", ");
      sb.append("age:");
      sb.append(this.age);
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // alas, we cannot check 'carId' because it's a primitive and you chose the non-beans generator.
    if (carName == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'carName' was not present! Struct: " + toString());
    }
    // alas, we cannot check 'price' because it's a primitive and you chose the non-beans generator.
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class CarStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public CarStandardScheme getScheme() {
      return new CarStandardScheme();
    }
  }

  private static class CarStandardScheme extends org.apache.thrift.scheme.StandardScheme<Car> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, Car struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // CAR_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.carId = iprot.readI32();
              struct.setCarIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // CAR_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.carName = iprot.readString();
              struct.setCarNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // PRICE
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.price = iprot.readI64();
              struct.setPriceIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // AGE
            if (schemeField.type == org.apache.thrift.protocol.TType.I16) {
              struct.age = iprot.readI16();
              struct.setAgeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      if (!struct.isSetCarId()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'carId' was not found in serialized data! Struct: " + toString());
      }
      if (!struct.isSetPrice()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'price' was not found in serialized data! Struct: " + toString());
      }
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, Car struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(CAR_ID_FIELD_DESC);
      oprot.writeI32(struct.carId);
      oprot.writeFieldEnd();
      if (struct.carName != null) {
        oprot.writeFieldBegin(CAR_NAME_FIELD_DESC);
        oprot.writeString(struct.carName);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(PRICE_FIELD_DESC);
      oprot.writeI64(struct.price);
      oprot.writeFieldEnd();
      if (struct.isSetAge()) {
        oprot.writeFieldBegin(AGE_FIELD_DESC);
        oprot.writeI16(struct.age);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class CarTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public CarTupleScheme getScheme() {
      return new CarTupleScheme();
    }
  }

  private static class CarTupleScheme extends org.apache.thrift.scheme.TupleScheme<Car> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, Car struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      oprot.writeI32(struct.carId);
      oprot.writeString(struct.carName);
      oprot.writeI64(struct.price);
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetAge()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetAge()) {
        oprot.writeI16(struct.age);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, Car struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.carId = iprot.readI32();
      struct.setCarIdIsSet(true);
      struct.carName = iprot.readString();
      struct.setCarNameIsSet(true);
      struct.price = iprot.readI64();
      struct.setPriceIsSet(true);
      java.util.BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        struct.age = iprot.readI16();
        struct.setAgeIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

