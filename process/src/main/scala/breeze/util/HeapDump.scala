package breeze.util

import javax.management.MBeanServer;
import java.lang.management.ManagementFactory;
import java.io.File
;
/**
 *
 * Outputs information about the heap
 *
 * http://blogs.sun.com/sundararajan/entry/programmatically_dumping_heap_from_java
 * @author dlwh
 */
object HeapDump  {
  // This is the name of the HotSpot Diagnostic MBean
  private val HOTSPOT_BEAN_NAME = "com.sun.management:type=HotSpotDiagnostic";

  // field to store the hotspot diagnostic MBean

  /**
   * Call this method from your application whenever you
   * want to dump the heap snapshot into a file.
   *
   * @param fileName name of the heap dump file
   * @param live flag that tells whether to dump
   *             only the live objects
   */
  def dumpHeap(fileName: String, live: Boolean=false) {
  }
}
