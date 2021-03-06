%Problem-2:xximage2.m : Write a program to convert any RGB image file to
%Gray scale. Use formula :  gs=.2989*r+.587*g+.114*b. Paste Gray scale
%image on RHS of RGB image
clc;
close all;
clear all;
file1=input('\nEnter your input Image File Name=','s');
file2=input('Enter your output image File Name=','s');
x=imread(file1);
[r,c,d]=size(x);
% To convert RGB to gray scale
y(1:r,1:c,1)=.2989*x(1:r,1:c,1)+.587*x(1:r,1:c,2)+.114*x(1:r,1:c,3);
x(1:r,c+1:2*c,1)=y(1:r,1:c,1);
x(1:r,c+1:2*c,2)=y(1:r,1:c,1);
x(1:r,c+1:2*c,3)=y(1:r,1:c,1);
imshow(x);
imwrite(x,file2);
%End of program
