package atlassian

/*
magine we have a system that stores files, and these files can be grouped into collections. We are interested in knowing where our resources are being taken up.

For this system we would like to generate a report that lists:

The total size of all files stored; and

The top N collections (by file size) where N can be a user-defined value
 */

/*
file1.txt (size: 100)
file2.txt (size: 200) in collection "collection1"
file3.txt (size: 200) in collection "collection1"
file4.txt (size: 300) in collection "collection2"
file5.txt (size: 10)
 */


fun fileReporter(input: List<FileDetail>, topNCollection: Int) : FileReport {
  val totalSize = input.sumOf { it.size } // O(1)
                            // O(n) + O(k)

  val collectionGrouped = input.filter { it.collectionName != null }.groupBy { it.collectionName }
                            //O(n) + O(nLog(n))
  val collectionWithTotalFileSize = collectionGrouped.map { it.key to it.value.sumOf { it.size } }.sortedByDescending { it.second }
                          // O(1)
  val interestedTopCollection = collectionWithTotalFileSize.map { it.first }.toList().sortedBy { it }.take(topNCollection)

  return FileReport(totalSize, interestedTopCollection as List<String>)
}

data class FileReport(val totalSize:Int, val collectionNames: List<String>)
data class FileDetail(val filename: String, val size: Int, val collectionName: String? = null)

