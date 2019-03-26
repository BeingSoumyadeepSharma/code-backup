clc;
close all;
clear all;
file1=input('\n enter input file name','s');
file2=input('\n enter output image file','s');

x=imread(file1);
[r,c,d]=size(x);

g(1:r,1:c,1)=0.2989*x(1:r,1:c,1)+0.587*x(1:r,1:c,2)+0.1140*x(1:r,1:c,3);

y=x;%copy rgb to y
y(1:r,c+1:2*c,1)=g(1:r,1:c,1);
y(1:r,c+1:2*c,2)=g(1:r,1:c,1);
y(1:r,c+1:2*c,3)=g(1:r,1:c,1);
imwrite(y,file2);
imshow(y);