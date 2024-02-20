# The micro-benchmark of Avro vs Json serialization
A simple example of serialization head to head comparison

According to results Avro outporforms Json in serialization/deserialization speed by 2 times

```
1 mln s/d json time 5633 ms
1 mln s/d avro time 2618 ms
2 mln s/d json time 10173 ms
2 mln s/d avro time 5093 ms
3 mln s/d json time 15252 ms
3 mln s/d avro time 7695 ms
4 mln s/d json time 20484 ms
4 mln s/d avro time 10304 ms
5 mln s/d json time 25553 ms
5 mln s/d avro time 13275 ms
```
