<?php
// PHP program solution for
// friends pairing problem

// Returns count of ways n people
// can remain single or paired up.
function countFriendsPairings($n)
{
	$dp[$n + 1] = 0;

	// Filling dp[] in bottom-up
	// manner using recursive formula
	// explained above.
	for ($i = 0; $i <= $n; $i++)
	{
		if ($i <= 2)
		$dp[$i] = $i;
		else
		$dp[$i] = $dp[$i - 1] +
					($i - 1) *
				$dp[$i - 2];
	}

	return $dp[$n];
}

// Driver code
$n = 4;
echo countFriendsPairings($n) ;
	
// This code is contributed
// by nitin mittal.
?>
