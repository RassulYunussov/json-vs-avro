/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package org.example.avro;

import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.SchemaStore;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;

@org.apache.avro.specific.AvroGenerated
public class Portfolio extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -5311445294101799626L;


  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Portfolio\",\"namespace\":\"org.example.avro\",\"fields\":[{\"name\":\"company\",\"type\":\"string\"},{\"name\":\"position\",\"type\":\"string\"},{\"name\":\"years\",\"type\":\"int\"},{\"name\":\"salary\",\"type\":\"double\"},{\"name\":\"efficiency_score\",\"type\":\"float\"},{\"name\":\"responsibilities\",\"type\":{\"type\":\"array\",\"items\":\"string\"}}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static final SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<Portfolio> ENCODER =
      new BinaryMessageEncoder<>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<Portfolio> DECODER =
      new BinaryMessageDecoder<>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<Portfolio> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<Portfolio> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<Portfolio> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this Portfolio to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a Portfolio from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a Portfolio instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static Portfolio fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  private CharSequence company;
  private CharSequence position;
  private int years;
  private double salary;
  private float efficiency_score;
  private java.util.List<CharSequence> responsibilities;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public Portfolio() {}

  /**
   * All-args constructor.
   * @param company The new value for company
   * @param position The new value for position
   * @param years The new value for years
   * @param salary The new value for salary
   * @param efficiency_score The new value for efficiency_score
   * @param responsibilities The new value for responsibilities
   */
  public Portfolio(CharSequence company, CharSequence position, Integer years, Double salary, Float efficiency_score, java.util.List<CharSequence> responsibilities) {
    this.company = company;
    this.position = position;
    this.years = years;
    this.salary = salary;
    this.efficiency_score = efficiency_score;
    this.responsibilities = responsibilities;
  }

  @Override
  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }

  @Override
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }

  // Used by DatumWriter.  Applications should not call.
  @Override
  public Object get(int field$) {
    switch (field$) {
    case 0: return company;
    case 1: return position;
    case 2: return years;
    case 3: return salary;
    case 4: return efficiency_score;
    case 5: return responsibilities;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @Override
  @SuppressWarnings(value="unchecked")
  public void put(int field$, Object value$) {
    switch (field$) {
    case 0: company = (CharSequence)value$; break;
    case 1: position = (CharSequence)value$; break;
    case 2: years = (Integer)value$; break;
    case 3: salary = (Double)value$; break;
    case 4: efficiency_score = (Float)value$; break;
    case 5: responsibilities = (java.util.List<CharSequence>)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'company' field.
   * @return The value of the 'company' field.
   */
  public CharSequence getCompany() {
    return company;
  }


  /**
   * Sets the value of the 'company' field.
   * @param value the value to set.
   */
  public void setCompany(CharSequence value) {
    this.company = value;
  }

  /**
   * Gets the value of the 'position' field.
   * @return The value of the 'position' field.
   */
  public CharSequence getPosition() {
    return position;
  }


  /**
   * Sets the value of the 'position' field.
   * @param value the value to set.
   */
  public void setPosition(CharSequence value) {
    this.position = value;
  }

  /**
   * Gets the value of the 'years' field.
   * @return The value of the 'years' field.
   */
  public int getYears() {
    return years;
  }


  /**
   * Sets the value of the 'years' field.
   * @param value the value to set.
   */
  public void setYears(int value) {
    this.years = value;
  }

  /**
   * Gets the value of the 'salary' field.
   * @return The value of the 'salary' field.
   */
  public double getSalary() {
    return salary;
  }


  /**
   * Sets the value of the 'salary' field.
   * @param value the value to set.
   */
  public void setSalary(double value) {
    this.salary = value;
  }

  /**
   * Gets the value of the 'efficiency_score' field.
   * @return The value of the 'efficiency_score' field.
   */
  public float getEfficiencyScore() {
    return efficiency_score;
  }


  /**
   * Sets the value of the 'efficiency_score' field.
   * @param value the value to set.
   */
  public void setEfficiencyScore(float value) {
    this.efficiency_score = value;
  }

  /**
   * Gets the value of the 'responsibilities' field.
   * @return The value of the 'responsibilities' field.
   */
  public java.util.List<CharSequence> getResponsibilities() {
    return responsibilities;
  }


  /**
   * Sets the value of the 'responsibilities' field.
   * @param value the value to set.
   */
  public void setResponsibilities(java.util.List<CharSequence> value) {
    this.responsibilities = value;
  }

  /**
   * Creates a new Portfolio RecordBuilder.
   * @return A new Portfolio RecordBuilder
   */
  public static Builder newBuilder() {
    return new Builder();
  }

  /**
   * Creates a new Portfolio RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new Portfolio RecordBuilder
   */
  public static Builder newBuilder(Builder other) {
    if (other == null) {
      return new Builder();
    } else {
      return new Builder(other);
    }
  }

  /**
   * Creates a new Portfolio RecordBuilder by copying an existing Portfolio instance.
   * @param other The existing instance to copy.
   * @return A new Portfolio RecordBuilder
   */
  public static Builder newBuilder(Portfolio other) {
    if (other == null) {
      return new Builder();
    } else {
      return new Builder(other);
    }
  }

  /**
   * RecordBuilder for Portfolio instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Portfolio>
    implements org.apache.avro.data.RecordBuilder<Portfolio> {

    private CharSequence company;
    private CharSequence position;
    private int years;
    private double salary;
    private float efficiency_score;
    private java.util.List<CharSequence> responsibilities;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$, MODEL$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.company)) {
        this.company = data().deepCopy(fields()[0].schema(), other.company);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.position)) {
        this.position = data().deepCopy(fields()[1].schema(), other.position);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (isValidValue(fields()[2], other.years)) {
        this.years = data().deepCopy(fields()[2].schema(), other.years);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
      if (isValidValue(fields()[3], other.salary)) {
        this.salary = data().deepCopy(fields()[3].schema(), other.salary);
        fieldSetFlags()[3] = other.fieldSetFlags()[3];
      }
      if (isValidValue(fields()[4], other.efficiency_score)) {
        this.efficiency_score = data().deepCopy(fields()[4].schema(), other.efficiency_score);
        fieldSetFlags()[4] = other.fieldSetFlags()[4];
      }
      if (isValidValue(fields()[5], other.responsibilities)) {
        this.responsibilities = data().deepCopy(fields()[5].schema(), other.responsibilities);
        fieldSetFlags()[5] = other.fieldSetFlags()[5];
      }
    }

    /**
     * Creates a Builder by copying an existing Portfolio instance
     * @param other The existing instance to copy.
     */
    private Builder(Portfolio other) {
      super(SCHEMA$, MODEL$);
      if (isValidValue(fields()[0], other.company)) {
        this.company = data().deepCopy(fields()[0].schema(), other.company);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.position)) {
        this.position = data().deepCopy(fields()[1].schema(), other.position);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.years)) {
        this.years = data().deepCopy(fields()[2].schema(), other.years);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.salary)) {
        this.salary = data().deepCopy(fields()[3].schema(), other.salary);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.efficiency_score)) {
        this.efficiency_score = data().deepCopy(fields()[4].schema(), other.efficiency_score);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.responsibilities)) {
        this.responsibilities = data().deepCopy(fields()[5].schema(), other.responsibilities);
        fieldSetFlags()[5] = true;
      }
    }

    /**
      * Gets the value of the 'company' field.
      * @return The value.
      */
    public CharSequence getCompany() {
      return company;
    }


    /**
      * Sets the value of the 'company' field.
      * @param value The value of 'company'.
      * @return This builder.
      */
    public Builder setCompany(CharSequence value) {
      validate(fields()[0], value);
      this.company = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'company' field has been set.
      * @return True if the 'company' field has been set, false otherwise.
      */
    public boolean hasCompany() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'company' field.
      * @return This builder.
      */
    public Builder clearCompany() {
      company = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'position' field.
      * @return The value.
      */
    public CharSequence getPosition() {
      return position;
    }


    /**
      * Sets the value of the 'position' field.
      * @param value The value of 'position'.
      * @return This builder.
      */
    public Builder setPosition(CharSequence value) {
      validate(fields()[1], value);
      this.position = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'position' field has been set.
      * @return True if the 'position' field has been set, false otherwise.
      */
    public boolean hasPosition() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'position' field.
      * @return This builder.
      */
    public Builder clearPosition() {
      position = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'years' field.
      * @return The value.
      */
    public int getYears() {
      return years;
    }


    /**
      * Sets the value of the 'years' field.
      * @param value The value of 'years'.
      * @return This builder.
      */
    public Builder setYears(int value) {
      validate(fields()[2], value);
      this.years = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'years' field has been set.
      * @return True if the 'years' field has been set, false otherwise.
      */
    public boolean hasYears() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'years' field.
      * @return This builder.
      */
    public Builder clearYears() {
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'salary' field.
      * @return The value.
      */
    public double getSalary() {
      return salary;
    }


    /**
      * Sets the value of the 'salary' field.
      * @param value The value of 'salary'.
      * @return This builder.
      */
    public Builder setSalary(double value) {
      validate(fields()[3], value);
      this.salary = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'salary' field has been set.
      * @return True if the 'salary' field has been set, false otherwise.
      */
    public boolean hasSalary() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'salary' field.
      * @return This builder.
      */
    public Builder clearSalary() {
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'efficiency_score' field.
      * @return The value.
      */
    public float getEfficiencyScore() {
      return efficiency_score;
    }


    /**
      * Sets the value of the 'efficiency_score' field.
      * @param value The value of 'efficiency_score'.
      * @return This builder.
      */
    public Builder setEfficiencyScore(float value) {
      validate(fields()[4], value);
      this.efficiency_score = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'efficiency_score' field has been set.
      * @return True if the 'efficiency_score' field has been set, false otherwise.
      */
    public boolean hasEfficiencyScore() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'efficiency_score' field.
      * @return This builder.
      */
    public Builder clearEfficiencyScore() {
      fieldSetFlags()[4] = false;
      return this;
    }

    /**
      * Gets the value of the 'responsibilities' field.
      * @return The value.
      */
    public java.util.List<CharSequence> getResponsibilities() {
      return responsibilities;
    }


    /**
      * Sets the value of the 'responsibilities' field.
      * @param value The value of 'responsibilities'.
      * @return This builder.
      */
    public Builder setResponsibilities(java.util.List<CharSequence> value) {
      validate(fields()[5], value);
      this.responsibilities = value;
      fieldSetFlags()[5] = true;
      return this;
    }

    /**
      * Checks whether the 'responsibilities' field has been set.
      * @return True if the 'responsibilities' field has been set, false otherwise.
      */
    public boolean hasResponsibilities() {
      return fieldSetFlags()[5];
    }


    /**
      * Clears the value of the 'responsibilities' field.
      * @return This builder.
      */
    public Builder clearResponsibilities() {
      responsibilities = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public Portfolio build() {
      try {
        Portfolio record = new Portfolio();
        record.company = fieldSetFlags()[0] ? this.company : (CharSequence) defaultValue(fields()[0]);
        record.position = fieldSetFlags()[1] ? this.position : (CharSequence) defaultValue(fields()[1]);
        record.years = fieldSetFlags()[2] ? this.years : (Integer) defaultValue(fields()[2]);
        record.salary = fieldSetFlags()[3] ? this.salary : (Double) defaultValue(fields()[3]);
        record.efficiency_score = fieldSetFlags()[4] ? this.efficiency_score : (Float) defaultValue(fields()[4]);
        record.responsibilities = fieldSetFlags()[5] ? this.responsibilities : (java.util.List<CharSequence>) defaultValue(fields()[5]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<Portfolio>
    WRITER$ = (org.apache.avro.io.DatumWriter<Portfolio>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<Portfolio>
    READER$ = (org.apache.avro.io.DatumReader<Portfolio>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    out.writeString(this.company);

    out.writeString(this.position);

    out.writeInt(this.years);

    out.writeDouble(this.salary);

    out.writeFloat(this.efficiency_score);

    long size0 = this.responsibilities.size();
    out.writeArrayStart();
    out.setItemCount(size0);
    long actualSize0 = 0;
    for (CharSequence e0: this.responsibilities) {
      actualSize0++;
      out.startItem();
      out.writeString(e0);
    }
    out.writeArrayEnd();
    if (actualSize0 != size0)
      throw new java.util.ConcurrentModificationException("Array-size written was " + size0 + ", but element count was " + actualSize0 + ".");

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      this.company = in.readString(this.company instanceof Utf8 ? (Utf8)this.company : null);

      this.position = in.readString(this.position instanceof Utf8 ? (Utf8)this.position : null);

      this.years = in.readInt();

      this.salary = in.readDouble();

      this.efficiency_score = in.readFloat();

      long size0 = in.readArrayStart();
      java.util.List<CharSequence> a0 = this.responsibilities;
      if (a0 == null) {
        a0 = new SpecificData.Array<CharSequence>((int)size0, SCHEMA$.getField("responsibilities").schema());
        this.responsibilities = a0;
      } else a0.clear();
      SpecificData.Array<CharSequence> ga0 = (a0 instanceof SpecificData.Array ? (SpecificData.Array<CharSequence>)a0 : null);
      for ( ; 0 < size0; size0 = in.arrayNext()) {
        for ( ; size0 != 0; size0--) {
          CharSequence e0 = (ga0 != null ? ga0.peek() : null);
          e0 = in.readString(e0 instanceof Utf8 ? (Utf8)e0 : null);
          a0.add(e0);
        }
      }

    } else {
      for (int i = 0; i < 6; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          this.company = in.readString(this.company instanceof Utf8 ? (Utf8)this.company : null);
          break;

        case 1:
          this.position = in.readString(this.position instanceof Utf8 ? (Utf8)this.position : null);
          break;

        case 2:
          this.years = in.readInt();
          break;

        case 3:
          this.salary = in.readDouble();
          break;

        case 4:
          this.efficiency_score = in.readFloat();
          break;

        case 5:
          long size0 = in.readArrayStart();
          java.util.List<CharSequence> a0 = this.responsibilities;
          if (a0 == null) {
            a0 = new SpecificData.Array<CharSequence>((int)size0, SCHEMA$.getField("responsibilities").schema());
            this.responsibilities = a0;
          } else a0.clear();
          SpecificData.Array<CharSequence> ga0 = (a0 instanceof SpecificData.Array ? (SpecificData.Array<CharSequence>)a0 : null);
          for ( ; 0 < size0; size0 = in.arrayNext()) {
            for ( ; size0 != 0; size0--) {
              CharSequence e0 = (ga0 != null ? ga0.peek() : null);
              e0 = in.readString(e0 instanceof Utf8 ? (Utf8)e0 : null);
              a0.add(e0);
            }
          }
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}










