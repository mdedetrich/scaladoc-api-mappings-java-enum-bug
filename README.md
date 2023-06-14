# scaladoc-api-mappings-java-enum-bug

To replicate, run `sbt ++doc` to generate docs for all scala versions and then open `target/scala-<SCALA_VERSION>/api/ScaladocJavaEnumBug.html`.
Search for `StandardOpenOption$` and you can see that the generate hyperlink 
`https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/nio/file/StandardOpenOption$.html#SYNC:java.nio.file.StandardOpenOption(SYNC)` is incorrect
because of that `$` (it should instead be `https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/nio/file/StandardOpenOption.html#SYNC:java.nio.file.StandardOpenOption(SYNC)`)
