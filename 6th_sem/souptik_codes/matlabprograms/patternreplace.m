clc;
clear all;
close all;


nv=0;
nc=0;
na=0;
file1=input('Enter input file name','s');
pattern=input('Enter pattern to be replaced','s');
replaced=input('Enter new pattern for replacing','s');
p_length=length(pattern);
fp1=fopen(file1,'r');
while(~feof(fp1))
    ch=fread(fp1,3,'uint8=>char');
    fprintf('\n pattern is : %s',ch);
    if(strcmp(pattern,ch)==1)
        fprintf('PATTERN FOUND !');
        fseek(fp1,-p_length,0);
        for i=1:length(replaced)
            fwrite(fp1,ch);
        end
    elseif(~feof(fp1))
        fseek(fp1,-p_length+1,0);
    end
end
fclose(fp1);

    
    