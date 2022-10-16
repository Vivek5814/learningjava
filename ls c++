// C++ program to find maximum length
// Snake sequence and print it
#include <bits/stdc++.h>
using namespace std;
#define M 4
#define N 4

struct Point
{
	int x, y;
};

// Function to find maximum length Snake sequence path
// (i, j) corresponds to tail of the snake
list<Point> findPath(int grid[M][N], int mat[M][N],
					int i, int j)
{
	list<Point> path;

	Point pt = {i, j};
	path.push_front(pt);

	while (grid[i][j] != 0)
	{
	if (i > 0 &&
		grid[i][j] - 1 == grid[i - 1][j])
	{
		pt = {i - 1, j};
		path.push_front(pt);
		i--;
	}
	else if (j > 0 &&
				grid[i][j] - 1 == grid[i][j - 1])
	{
		pt = {i, j - 1};
		path.push_front(pt);
		j--;
	}
	}

	return path;
}

// Function to find maximum length Snake sequence
void findSnakeSequence(int mat[M][N])
{
	// table to store results of subproblems
	int lookup[M][N];

	// initialize by 0
	memset(lookup, 0, sizeof lookup);

	// stores maximum length of Snake sequence
	int max_len = 0;

	// store coordinates to snake's tail
	int max_row = 0;
	int max_col = 0;

	// fill the table in bottom-up fashion
	for (int i = 0; i < M; i++)
	{
		for (int j = 0; j < N; j++)
		{
			// do except for (0, 0) cell
			if (i || j)
			{
				// look above
				if (i > 0 &&
					abs(mat[i - 1][j] - mat[i][j]) == 1)
				{
					lookup[i][j] = max(lookup[i][j],
							lookup[i - 1][j] + 1);

					if (max_len < lookup[i][j])
					{
						max_len = lookup[i][j];
						max_row = i, max_col = j;
					}
				}

				// look left
				if (j > 0 &&
					abs(mat[i][j - 1] - mat[i][j]) == 1)
				{
					lookup[i][j] = max(lookup[i][j],
									lookup[i][j - 1] + 1);
					if (max_len < lookup[i][j])
					{
						max_len = lookup[i][j];
						max_row = i, max_col = j;
					}
				}
			}
		}
	}

	cout << "Maximum length of Snake sequence is: "
		<< max_len << endl;

	// find maximum length Snake sequence path
	list<Point> path = findPath(lookup, mat, max_row,
											max_col);

	cout << "Snake sequence is:";
	for (auto it = path.begin(); it != path.end(); it++)
		cout << endl << mat[it->x][it->y] << " ("
			<< it->x << ", " << it->y << ")" ;
}

// Driver code
int main()
{
	int mat[M][N] =
	{
		{9, 6, 5, 2},
		{8, 7, 6, 5},
		{7, 3, 1, 6},
		{1, 1, 1, 7},
	};

	findSnakeSequence(mat);

	return 0;
}
