// CHAPTER 5: tree


/*

Tree-no value

BT	-Max 2 anak
	-location new node suka hati


BST	- if key value(primary key) anak < key value parent -> anak kiri
	- if key value(primary key) anak > key value parent -> anak kanan
	- if key value(primary key) anak = key value parent -> reject(no duplicate)

*/


/*
1) define structure
2) define start pointer
3) newkan node
3.5) masukkan node dalam queue
4. Assign value to all data member
5. Lengkapkan linkedlist(follow 2 rules)
*/


#include <iostream>
using namespace std;

//1) define structure

struct BST
{

	BST* left;
	string nopend;
	BST* right;

};

//2) define start pointer

BST* root = NULL; //declaration - allocate memory block
BST* tmp;



int main(void) {

	//3) newkan node
	BST* rima = new BST;
	
	//4) assign (first node)
	rima->nopend = "1030";
	rima->left = NULL;
	rima->right = NULL;
	
	//5. Lengkapkan linkedlist(follow 2 rules)
	root = rima; // root ambil alamat rima


	//CREATE ANOTHER NODE

	// follow step 3,4,5
	BST* rima = new BST;

	rima->nopend = "1015";
	rima->left = NULL;
	rima->right = NULL;

	if (rima->nopend < root->nopend)
	{	
		//anak kiri
		root->left = rima;

	}
	else if (rima->nopend > root->nopend) 
	{
		//anak kanan
		root->right = rima;

	}
	else // rima->nopend = root->nopend
	{
		cout << "Nilai duplicate, Cannot add. ";
	}



	//CREATE ANOTHER NODE

	// follow step 3,4,5
	
	// TIPS: new node akan sentiasa ada nama , kalau situasi ni "rima" skrg ada nama.

	BST* rima = new BST;

	rima->nopend = "1050";
	rima->left = NULL;
	rima->right = NULL;

		//nopend 1050	nopend 1030
	if (rima->nopend < root->nopend)
	{
		//anak kiri
		root->left = rima;

	}		//nopend 1050	nopend 1030
	else if (rima->nopend > root->nopend)
	{
		//anak kanan
		root->right = rima;

	}
	else // rima->nopend = root->nopend
	{
		cout << "Nilai duplicate, Cannot add. ";
	}


	//HABIS LEVEL 1


	//=======================================
	//CREATE ANOTHER NODE 
	//UNTUK LEVEL 2

	// follow step 3,4,5

	// TIPS: new node akan sentiasa ada nama , kalau situasi ni "rima" skrg ada nama.

	BST* rima = new BST;

	rima->nopend = "1045";
	rima->left = NULL;
	rima->right = NULL;

	tmp = root;

	while (tmp != NULL)
	{

	
		if (rima->nopend < tmp->nopend)
		{
			if (tmp->left == NULL)
			{
				//anak kiri
				tmp->left = rima; break;

			}
			else
			{
				tmp = tmp->left;
			}
			

		}		
		else if (rima->nopend > tmp->nopend)
		{
			if (tmp -> right == NULL)
			{
				//anak kanan
				tmp->right = rima; break;

			}
			else
			{
				tmp = tmp->right;
			}
			
		}
		else // rima->nopend = root->nopend
		{
			cout << "Nilai duplicate, Cannot add. ";
		}


	}


	system("pause");
	return 0;
}
