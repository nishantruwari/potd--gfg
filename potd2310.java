class Solution {

    // Return the sum of last n nodes
    public int sumOfLastN_Nodes(Node head, int n) {
        int sum = 0;
        Queue<Integer> q = new java.util.LinkedList<Integer>();
        Node temp = head;

        while (temp != null) {
            int i = temp.data;

            if (q.size() < n) {
                q.add(i);
                sum += i;
            } else {
                sum -= q.poll(); // Remove the oldest element from the sum
                q.add(i);
                sum += i; // Add the new element to the sum
            }

            // Move to the next node
            temp = temp.next;
        }

        return sum;
    }
}
