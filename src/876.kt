class ListNode(var `val`: Int) {
        var next: ListNode? = null
    }

fun middleNode(head: ListNode?): ListNode? {
    val nodes = mutableListOf<ListNode>()
    var node = head
    while (node != null) {
        nodes.add(node)
        node = node.next
    }
    return nodes[nodes.size / 2]
}