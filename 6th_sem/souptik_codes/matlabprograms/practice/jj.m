LC;
CLEAR ALL;
CLOSE ALL;

FILE1=INPUT('ENTER INPUT FILE NAME','S');
FILE2=INPUT('ENTER OUTPUT FILE NAME','S');
FP1=FOPEN(FILE1,'R');
FP2=FOPEN(FILE2,'WT');
FSEEK(FP1,1,-1);
WHILE ~FEOF(FP1)
	CH=FREAD(FP1,1);
	IF ((CH>=97) && (CH<=122) )
		CH=CH-32;
	END
	FWRITE(FP2,CH);
END
FCLOSE('ALL');
