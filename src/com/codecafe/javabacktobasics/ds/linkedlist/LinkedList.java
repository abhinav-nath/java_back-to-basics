package com.codecafe.javabacktobasics.ds.linkedlist;

public class LinkedList {

  Node head; // head of the list

  // Method to insert a new node
  public static LinkedList insert(LinkedList list, String data) {
    // Create a new node with given data
    Node newNode = new Node(data);

    // If the Linked List is empty then make the new node as head
    if (list.head == null) {
      list.head = newNode;
    } else {
      // Else traverse till last node and insert the new node there
      Node last = list.head;
      while (last.next != null) {
        last = last.next;
      }

      // Insert the new node at the last
      last.next = newNode;
    }

    // Return the list
    return list;
  }

  // Method to insert a node at a specific position
  public static LinkedList insertAtPosition(LinkedList list, String data, int index) {
    // Store head node
    Node currentNode = list.head;
    Node prev = null;

    // Create a new node with given data
    Node newNode = new Node(data);

    // If the Linked List is empty then make the new node as head
    if (list.head == null) {
      list.head = newNode;
    } else {

      // Traverse to the index
      // keep track of the prev node as it is needed to change currentNode.next
      int counter = 0;
      while (currentNode != null) {

        if (counter == index) {
          // Since the currentNode is the required position, unlink currentNode from the
          // linked list
          prev.next = newNode;
          newNode.next = currentNode.next;

          System.out.println("\n" + data + " inserted at position " + index);
          break;
        } else {
          // If the current position is not the index then continue to the next node
          prev = currentNode;
          currentNode = currentNode.next;
          counter++;
        }
      }
    }

    if (currentNode == null) {
      System.out.println("\n" + "Position " + index + " does not exist");
    }

    // Return the list
    return list;
  }

  // Method to delete a node by Key
  public static LinkedList deleteByKey(LinkedList list, String key) {
    // Store head node
    Node currentNode = list.head;
    Node prev = null;

    // Case 1 : If the head node itself holds the key to be deleted
    if (currentNode != null && key.equals(currentNode.data)) {
      list.head = currentNode.next; // Changed head

      // Display the message
      System.out.println("\n" + key + " found and deleted");

      // Return the updated list
      return list;
    }

    // Case 2 : If the key is somewhere other than the head node
    // Search for the key to be deleted
    // Keep track of the previous node as it is needed to change currentNode.next
    while (currentNode != null && !key.equals(currentNode.data)) {
      // If currentNode does not hold the key, continue to next node
      prev = currentNode;
      currentNode = currentNode.next;
    }

    // If the key was present, it should be at currentNode
    // Therefore the currentNode shall not be null
    if (currentNode != null) {
      // Since the key is at currentNode
      // Unlink currentNode from linked list
      prev.next = currentNode.next;

      // Display the message
      System.out.println("\n" + key + " found and deleted");
    } else {
      // Case 3 : The key is not present
      // If the key is not present in the linked list, currentNode should be null
      System.out.println("\n" + key + " not found");
    }
    return list;
  }

  // Method to print the Linked List
  public static void printList(LinkedList list) {
    Node currentNode = list.head;

    System.out.println("\nLinked List\n-----------");

    // Traverse through the Linked List
    while (currentNode != null) {
      // Print the data at current node
      System.out.print(currentNode.data + " ");

      // Go to next node
      currentNode = currentNode.next;
    }
    System.out.println();
  }

  // Method to delete a node in the Linked List by Position
  public static LinkedList deleteByPosition(LinkedList list, int index) {
    // Store head node
    Node currentNode = list.head;
    Node prev = null;

    // Case 1 : If index is 0, then the head node itself is to be deleted
    if (index == 0 && currentNode != null) {
      list.head = currentNode.next; // Changed head

      System.out.println("\n" + "element at position " + index + " deleted");

      return list;
    }

    // Case 2 : If the index is greater than 0 but less then the size of the linked
    // list
    int counter = 0;

    // Count for the index to be deleted
    // keep track of the prev node as it is needed to change currentNode.next
    while (currentNode != null) {

      if (counter == index) {
        // Since the currentNode is the required position, unlink currentNode from the
        // linked list
        prev.next = currentNode.next;

        System.out.println("\n" + "element at position " + index + " deleted");
        break;
      } else {
        // If the current position is not the index then continue to the next node
        prev = currentNode;
        currentNode = currentNode.next;
        counter++;
      }
    }

    // If the position element was found, it should be at currentNode
    // Therefore currentNode shall not be null

    // Case 3 : The index is greater than the size of the LinkedList
    // In this case, the currNode should be null
    if (currentNode == null) {
      System.out.println("\n" + "element at position " + index + " not found");
    }

    // return the List
    return list;
  }

  // Driver code
  public static void main(String[] args) {
    // Start with an empty List
    LinkedList list = new LinkedList();

    // Insert the values
    list = insert(list, "Rick");
    list = insert(list, "Carl");
    list = insert(list, "Negan");
    list = insert(list, "Glenn");
    list = insert(list, "Daryl");
    list = insert(list, "Michonne");
    list = insert(list, "Judith");

    printList(list);

    deleteByKey(list, "Rick");

    printList(list);

    deleteByKey(list, "Glenn");

    printList(list);

    deleteByKey(list, "Carol");

    printList(list);

    deleteByPosition(list, 0);

    printList(list);

    deleteByPosition(list, 2);

    printList(list);

    deleteByPosition(list, 10);

    printList(list);

    insertAtPosition(list, "Goku", 10);
    printList(list);
  }

}