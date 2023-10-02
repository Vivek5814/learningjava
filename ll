#include <stdio.h>
#include <stdlib.h>

typedef struct node {
	void* data;
	struct node* next;
} Node;

typedef struct list {
	int size;
	Node* head;
} List;

List* create_list() {
	List* new_list = (List*)malloc(sizeof(List));
	new_list->size = 0;
	new_list->head = NULL;
	return new_list;
}

void add_to_list(List* list, void* data) {
	Node* new_node = (Node*)malloc(sizeof(Node));
	new_node->data = data;
	new_node->next = list->head;
	list->head = new_node;
	list->size++;
}

void* remove_from_list(List* list) {
	if (list->size == 0) {
		return NULL;
	}
	Node* node_to_remove = list->head;
	void* data = node_to_remove->data;
	list->head = node_to_remove->next;
	free(node_to_remove);
	list->size--;
	return data;
}

void free_list(List* list) {
	Node* current_node = list->head;
	while (current_node != NULL) {
		Node* next_node = current_node->next;
		free(current_node);
		current_node = next_node;
	}
	free(list);
}

int main() {
	// create a new list
	List* int_list = create_list();
	
	// add some integers to the list
	int x = 42;
	add_to_list(int_list, (void*)&x);
	int y = 13;
	add_to_list(int_list, (void*)&y);
	int z = 99;
	add_to_list(int_list, (void*)&z);
	
	// remove the integers from the list and print them
	int* int_ptr = NULL;
	while ((int_ptr = (int*)remove_from_list(int_list)) != NULL) {
		printf("%d\n", *int_ptr);
	}
	
	// free the memory used by the list
	free_list(int_list);
	
	return 0;
}
