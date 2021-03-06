	/* ancg_10.c: Write a program to draw a triangle ABC.
	Draw a line  using Integer Bresenham Algorithm. Take rotation
	around origin */
	#include<stdio.h>
	#include<graphics.h>
	#include<math.h>
	int c;
	int n;
	void draw_xy();
	void bresenham(int x1,int y1,int x2,int y2,int x[],int y[]);
	int signx(int x);
	void dda(int x1,int y1,int x2,int y2,int x[],int y[]);
	int round1(float x);
	void line_draw(int x[],int y[],int m,int c1);
	void triangle_draw(int x1,int y1,int x2,int y2,int x3,int y3);
	void rotation(int x1,int y1,int x2,int y2,int x3,int y3,float th);
	void main()
	{
	int x1,y1,x2,y2,x3,y3;
	float th;
	char a[100];
	clrscr();
	printf("\nEnter x-coordinate of point A=");
	scanf("%d",&x1);
	printf("Enter y-coordinate of point A=");
	scanf("%d",&y1);
	printf("Enter x-coordinate of point B=");
	scanf("%d",&x2);
	printf("Enter y-coordinate of point B=");
	scanf("%d",&y2);
	printf("Enter x-coordinate of point C=");
	scanf("%d",&x3);
	printf("Enter y-coordinate of point C=");
	scanf("%d",&y3);
	printf("\nEnter color code of line(1,2,3,4,5,15)=");
	scanf("%d",&c);
	printf("\nEnter rotation angle in degree(+ve/-ve)=");
	scanf("%f",&th);
        draw_xy();
	/*triangle_draw(x1,y1,x2,y2,x3,y3);*/
	rotation(x1,y1,x2,y2,x3,y3,th);
	sprintf(a,"A(%d,%d)",x1,y1);
	outtextxy(320+x1,240-y1,a);
	sprintf(a,"B(%d,%d)",x2,y2);
	outtextxy(320+x2,240-y2,a);
	sprintf(a,"C(%d,%d)",x3,y3);
	outtextxy(320+x3,240-y3,a);
	getch();
	closegraph();
	}
	void draw_xy()
	{
	int gd=DETECT, gm;
	int i;
	initgraph(&gd,&gm,"c://tc//bgi");
	setbkcolor(6);
	setcolor(1);
	/* To draw x-axis */
		for(i=0;i<640;i++)
		{
		putpixel(i,240,15);
		delay(2500);
		}
	/* To draw y-axis */
		for(i=0;i<480;i++)
		{
		putpixel(320,i,15);
		delay(2500);
		}
	/* To display -X, +X, +Y , -Y and O(0,0) */
	outtextxy(10,245,"-X");
	outtextxy(620,245,"+X");
	outtextxy(325,10,"+Y");
	outtextxy(325,470,"-Y");
	outtextxy(325,245,"O(0,0)");
	}
	/* int round1(float x) : Function to get rounded value of x */
	int round1(float x)
	{
	int ix,s;
	float x1,xx;
	ix=x;
		if(x<0)
		s=-1;
		else
		s=1;
	x1=x-ix;
		if(x1<0)
		xx=-x1;
		else
		xx=x1;
		if(xx>=.5)
		{
			if(s==1)
			ix=ix+1;
			else
			ix=ix-1;
		}
	return ix;
	}

	/* void dda(int x1,int y1,int x2,int y2,int x[],int y[]) :
	Function to implement DDA algorithm. */

	void dda(int x1,int y1,int x2,int y2,int x[],int y[])
	{
	int dx,dy,dx1,dy1;
	float delx,dely,xx,yy;
	int i,length;
	dx=x2-x1;
	dy=y2-y1;
		if(dx<0)
		dx1=-dx;
		else
		dx1=dx;
		if(dy<0)
		dy1=-dy;
		else
		dy1=dy;
		if(dx1>dy1)
		length=dx1;
		else
		length=dy1;
	delx=(float)dx/length;
	dely=(float)dy/length;
	xx=x1;
	yy=y1;
	x[0]=x1;
	y[0]=y1;
		for(i=1;i<=length;i++)
		{
		xx=xx+delx;
		yy=yy+dely;
		x[i]=round1(xx);
		y[i]=round1(yy);
		}
	n=length;
	}
	/* void line_draw(int x[],int y[],int n1,int c1) : Function to
	draw a line */

	void line_draw(int x[],int y[],int n1,int c1)
	{
	int i;
		for(i=0;i<=n1;i++)
		{
		putpixel(320+x[i],240-y[i],c1);
		delay(2500);
		}
	}

	/* int singnx(int x) : Function to calculate sign of a number */

	int signx(int x)
	{
		if(x<0)
		return -1;
		else if(x==0)
		return 0;
		else
		return 1;
	}


	/* Integer generalised Bresenham Line draw method */

	void bresenham(int x1,int y1,int x2,int y2,int x[],int y[])
	{
	int delx,dely,d1,d2,s1,s2,temp,e,xx,yy;
	int interchange,i;
	xx=x1;
	yy=y1;
	d1=x2-x1;
	d2=y2-y1;
		if(d1<0)
		delx=-d1;
		else
		delx=d1;
		if(d2<0)
		dely=-d2;
		else
		dely=d2;
	s1=signx(x2-x1);
	s2=signx(y2-y1);
		if(dely>delx)
		{
		temp=dely;
		dely=delx;
		delx=temp;
		interchange=1;
		}
		else
		interchange=0;
	e=2*dely-delx;
	i=0;
	x[i]=xx;
	y[i]=yy;
		for(i=1;i<=delx;i++)
		{
			while(e>=0)
			{
				if(interchange==1)
				xx=xx+s1;
				else
				yy=yy+s2;
			e=e-2*delx;
			}
			if(interchange==1)
			yy=yy+s2;
			else
			xx=xx+s1;
		e=e+2*dely;
		x[i]=xx;
		y[i]=yy;
		}
	n=delx;
	/*
		for(i=0;i<=delx;i++)
		printf("i=%d x[%d]=%d y[%d]=%d\n",i,i,x[i],i,y[i]);
	getch(); */
	}

	/*void triangle_draw(int x1,int y1,int x2,int y2,int x3,int y3)  :
	Function to draw a triangle. */

        void triangle_draw(int x1,int y1,int x2,int y2,int x3,int y3)
	{
	int x[700], y[700];
	bresenham(x1,y1,x2,y2,x,y);/*To draw a line from (x1,y1) to (x2,y2)*/
	line_draw(x,y,n,c);
	bresenham(x2,y2,x3,y3,x,y);/*To draw a line from (x2,y2) to (x3,y3)*/
	line_draw(x,y,n,c);
	bresenham(x3,y3,x1,y1,x,y);/*To draw a line from (x3,y3) to (x1,y1)*/
	line_draw(x,y,n,c);
	}
       /* void rotation(int x1,int y1,int x2,int y2,int x3,int y3, float th)
	: Function to rotate a triangle around origin. */

	void rotation(int x1,int y1,int x2,int y2,int x3,int y3, float th)
	{
	int x11,y11,x22,y22,x33,y33;
	int i,j,k;
	char a[100];
	float rot[3][3];
	int t[3][3];
	int tr[3][3];
	rot[0][0]=cos(th*3.141593/180);
	rot[0][1]=-sin(th*3.141593/180);
	rot[0][2]=0;
	rot[1][0]=sin(th*3.141593/180);
	rot[1][1]=cos(th*3.141593/180);
	rot[0][2]=0;
	rot[2][0]=0;
	rot[2][1]=0;
	rot[2][2]=1;
	t[0][0]=x1;
	t[0][1]=x2;
	t[0][2]=x3;
	t[1][0]=y1;
	t[1][1]=y2;
	t[1][2]=y3;
	t[2][0]=1;
	t[2][1]=2;
	t[2][2]=3;
		for(i=0;i<3;i++)
			for(j=0;j<3;j++)
			{
			tr[i][j]=0;
				for(k=0;k<3;k++)
				tr[i][j]=tr[i][j]+round1(rot[i][k]*t[k][j]);
			}
	x11=tr[0][0];
	y11=tr[1][0];
	x22=tr[0][1];
	y22=tr[1][1];
	x33=tr[0][2];
	y33=tr[1][2];
	triangle_draw(x1,y1,x2,y2,x3,y3);
	triangle_draw(x11,y11,x22,y22,x33,y33);
	sprintf(a,"A1(%d,%d)",x11,y11);
	outtextxy(320+x11,240-y11,a);
	sprintf(a,"B1(%d,%d)",x22,y22);
	outtextxy(320+x22,240-y22,a);
	sprintf(a,"C1(%d,%d)",x33,y33);
	outtextxy(320+x33,240-y33,a);
	}
































