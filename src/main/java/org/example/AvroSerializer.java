package org.example;


import org.apache.avro.io.*;
import org.apache.avro.specific.SpecificDatumReader;
import org.apache.avro.specific.SpecificDatumWriter;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class AvroSerializer<T>
{
    private final DatumReader<T> reader;
    private final DatumWriter<T> writer;

    AvroSerializer(final org.apache.avro.Schema schema) {
        this.reader = new SpecificDatumReader<>(schema);
        this.writer = new SpecificDatumWriter<>(schema);
    }

    public byte[] serialize(T msg) throws IOException, IllegalStateException
    {
        final var byteArrayOutputStream = new ByteArrayOutputStream();
        BinaryEncoder encoder = EncoderFactory.get().binaryEncoder(byteArrayOutputStream, null);
        writer.write(msg, encoder);
        encoder.flush();
        byteArrayOutputStream.flush();
        return byteArrayOutputStream.toByteArray();
    }

    public T deserialize(byte[] msg) throws IOException, IllegalStateException
    {
        BinaryDecoder decoder = DecoderFactory.get().binaryDecoder(msg, null);
        return reader.read(null, decoder);
    }

}