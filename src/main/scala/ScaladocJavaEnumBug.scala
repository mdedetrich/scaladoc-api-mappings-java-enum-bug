import java.nio.file.OpenOption
import java.nio.file.StandardOpenOption.{CREATE, TRUNCATE_EXISTING, WRITE}

class ScaladocJavaEnumBug {

  /**
   * the underlying behavior when writing the file. If [[java.nio.file.StandardOpenOption.SYNC]]
   * @param options
   */
  def myFunc(options: Set[OpenOption] = Set(WRITE, TRUNCATE_EXISTING, CREATE)): Unit = {}
}
