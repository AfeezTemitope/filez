let chess = 8;
let board = " ";

for (let row = 0; row < chess; row+=1){
	for (let col = 0; col < chess; col+=1){
	   if ((row + col) % 2 == 0){
		board += " ";
		} else {
		board += "#";
}
}
board += "\n";
}

console.log(board);