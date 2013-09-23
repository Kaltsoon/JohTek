/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package shakki;

import position.Evaluator;
import position.Position;


/**
 *
 * @author Hannu
 */

public class YourEvaluator extends Evaluator {
    @Override
	public double eval(Position p) {
		double ret;
                double points=0;
                double movement=0;
                double ominousness=0;
                
		for(int x = 0; x < p.board.length; ++x) {
			for(int y = 0; y < p.board[x].length; ++y) {
				if(p.board[x][y] == Position.Empty) continue;
				if(p.board[x][y] == Position.WKing){
                                    points += 3.0;
                                    ominousness+=ominousness(p,x,y);
                                    if(inTable(p,x+1,y) && p.board[x+1][y] == Position.Empty){
                                        movement+=3.0;
                                    }
                                    if(inTable(p,x-1,y) && p.board[x-1][y] == Position.Empty){
                                        movement+=3.0;
                                    }
                                    if(inTable(p,x,y+1) && p.board[x][y+1] == Position.Empty){
                                        movement+=3.0;
                                    }
                                    if(inTable(p,x,y-1) && p.board[x][y-1] == Position.Empty){
                                        movement+=3.0;
                                    }
                                    if(inTable(p,x+1,y+1) && p.board[x+1][y+1] == Position.Empty){
                                        movement+=3.0;
                                    }
                                    if(inTable(p,x-1,y-1) && p.board[x-1][y-1] == Position.Empty){
                                        movement+=3.0;
                                    }
                                    if(inTable(p,x-1,y+1) && p.board[x-1][y+1] == Position.Empty){
                                        movement+=3.0;
                                    }
                                    if(inTable(p,x+1,y-1) && p.board[x+1][y-1] == Position.Empty){
                                        movement+=3.0;
                                    }
                                }
				if(p.board[x][y] == Position.WQueen){
                                    points += 10.4;
                                    ominousness+=ominousness(p,x,y);
                                    if(inTable(p,x+1,y) && p.board[x+1][y] == Position.Empty){
                                        movement+=10.4;
                                    }
                                    if(inTable(p,x-1,y) && p.board[x-1][y] == Position.Empty){
                                        movement+=10.4;
                                    }
                                    if(inTable(p,x,y+1) && p.board[x][y+1] == Position.Empty){
                                        movement+=10.4;
                                    }
                                    if(inTable(p,x,y-1) && p.board[x][y-1] == Position.Empty){
                                        movement+=10.4;
                                    }
                                    if(inTable(p,x+1,y+1) && p.board[x+1][y+1] == Position.Empty){
                                        movement+=10.4;
                                    }
                                    if(inTable(p,x-1,y-1) && p.board[x-1][y-1] == Position.Empty){
                                        movement+=10.4;
                                    }
                                    if(inTable(p,x-1,y+1) && p.board[x-1][y+1] == Position.Empty){
                                        movement+=10.4;
                                    }
                                    if(inTable(p,x+1,y-1) && p.board[x+1][y-1] == Position.Empty){
                                        movement+=10.4;
                                    }
                                }
				if(p.board[x][y] == Position.WRook){
                                    points += 6.4;
                                    ominousness+=ominousness(p,x,y);
                                    if(inTable(p,x+1,y) && p.board[x+1][y] == Position.Empty){
                                        movement+=6.4;
                                    }
                                    if(inTable(p,x-1,y) && p.board[x-1][y] == Position.Empty){
                                        movement+=6.4;
                                    }
                                    if(inTable(p,x,y+1) && p.board[x][y+1] == Position.Empty){
                                        movement+=6.4;
                                    }
                                    if(inTable(p,x,y-1) && p.board[x][y-1] == Position.Empty){
                                        movement+=6.4;
                                    }
                                }
				if(p.board[x][y] == Position.WBishop){
                                    points += 4.0;
                                    ominousness+=ominousness(p,x,y);
                                    if(inTable(p,x+1,y+1) && p.board[x+1][y+1] == Position.Empty){
                                        movement+=4.0;
                                    }
                                    if(inTable(p,x-1,y-1) && p.board[x-1][y-1] == Position.Empty){
                                        movement+=4.0;
                                    }
                                    if(inTable(p,x-1,y+1) && p.board[x-1][y+1] == Position.Empty){
                                        movement+=4.0;
                                    }
                                    if(inTable(p,x+1,y-1) && p.board[x+1][y-1] == Position.Empty){
                                        movement+=4.0;
                                    }
                                }
				if(p.board[x][y] == Position.WKnight){
                                    points += 2.4;
                                    ominousness+=ominousness(p,x,y);
                                    if(inTable(p,x+2,y-1) && p.board[x+2][y-1] == Position.Empty){
                                        movement+=2.4;
                                    }
                                    if(inTable(p,x+2,y+1) && p.board[x+2][y+1] == Position.Empty){
                                        movement+=2.4;
                                    }
                                    if(inTable(p,x-2,y-1) && p.board[x-2][y-1] == Position.Empty){
                                        movement+=2.4;
                                    }
                                    if(inTable(p,x-2,y+1) && p.board[x-2][y+1] == Position.Empty){
                                        movement+=2.4;
                                    }
                                    if(inTable(p,x-1,y+2) && p.board[x-1][y+2] == Position.Empty){
                                        movement+=2.4;
                                    }
                                    if(inTable(p,x+1,y-2) && p.board[x+1][y-2] == Position.Empty){
                                        movement+=2.4;
                                    }
                                    if(inTable(p,x-1,y+2) && p.board[x-1][y+2] == Position.Empty){
                                        movement+=2.4;
                                    }
                                    if(inTable(p,x+1,y+2) && p.board[x+1][y+2] == Position.Empty){
                                        movement+=2.4;
                                    }
                                }
				if(p.board[x][y] == Position.WPawn){
                                    points += 1;
                                    ominousness+=ominousness(p,x,y);
                                    if(inTable(p,x,y-1) && p.board[x][y-1] == Position.Empty){
                                        movement+=1;
                                    }
                                    if(y-1==0){
                                        ominousness+=10.4;
                                    }
                                }
				if(p.board[x][y] == Position.BKing){
                                    points -= 3.0;
                                    ominousness-=ominousness(p,x,y);
                                    if(inTable(p,x+1,y) && p.board[x+1][y] == Position.Empty){
                                        movement-=3.0;
                                    }
                                    if(inTable(p,x-1,y) && p.board[x-1][y] == Position.Empty){
                                        movement-=3.0;
                                    }
                                    if(inTable(p,x,y+1) && p.board[x][y+1] == Position.Empty){
                                        movement-=3.0;
                                    }
                                    if(inTable(p,x,y-1) && p.board[x][y-1] == Position.Empty){
                                        movement-=3.0;
                                    }
                                    if(inTable(p,x+1,y+1) && p.board[x+1][y+1] == Position.Empty){
                                        movement-=3.0;
                                    }
                                    if(inTable(p,x-1,y-1) && p.board[x-1][y-1] == Position.Empty){
                                        movement-=3.0;
                                    }
                                    if(inTable(p,x-1,y+1) && p.board[x-1][y+1] == Position.Empty){
                                        movement-=3.0;
                                    }
                                    if(inTable(p,x+1,y-1) && p.board[x+1][y-1] == Position.Empty){
                                        movement-=3.0;
                                    }
                                }
				if(p.board[x][y] == Position.BQueen){
                                    points -= 10.4;
                                    ominousness-=ominousness(p,x,y);
                                    if(inTable(p,x+1,y) && p.board[x+1][y] == Position.Empty){
                                        movement-=10.4;
                                    }
                                    if(inTable(p,x-1,y) && p.board[x-1][y] == Position.Empty){
                                        movement-=10.4;
                                    }
                                    if(inTable(p,x,y+1) && p.board[x][y+1] == Position.Empty){
                                        movement-=10.4;
                                    }
                                    if(inTable(p,x,y-1) && p.board[x][y-1] == Position.Empty){
                                        movement-=10.4;
                                    }
                                    if(inTable(p,x+1,y+1) && p.board[x+1][y+1] == Position.Empty){
                                        movement-=10.4;
                                    }
                                    if(inTable(p,x-1,y-1) && p.board[x-1][y-1] == Position.Empty){
                                        movement-=10.4;
                                    }
                                    if(inTable(p,x-1,y+1) && p.board[x-1][y+1] == Position.Empty){
                                        movement-=10.4;
                                    }
                                    if(inTable(p,x+1,y-1) && p.board[x+1][y-1] == Position.Empty){
                                        movement-=10.4;
                                    }
                                }
				if(p.board[x][y] == Position.BRook){
                                    points -= 6.4;
                                    ominousness-=ominousness(p,x,y);
                                     if(inTable(p,x+1,y) && p.board[x+1][y] == Position.Empty){
                                        movement-=6.4;
                                    }
                                    if(inTable(p,x-1,y) && p.board[x-1][y] == Position.Empty){
                                        movement-=6.4;
                                    }
                                    if(inTable(p,x,y+1) && p.board[x][y+1] == Position.Empty){
                                        movement-=6.4;
                                    }
                                    if(inTable(p,x,y-1) && p.board[x][y-1] == Position.Empty){
                                        movement-=6.4;
                                    }
                                }
				if(p.board[x][y] == Position.BBishop){
                                    points -= 4.0;
                                    ominousness-=ominousness(p,x,y);
                                    if(inTable(p,x+1,y+1) && p.board[x+1][y+1] == Position.Empty){
                                        movement-=4.0;
                                    }
                                    if(inTable(p,x-1,y-1) && p.board[x-1][y-1] == Position.Empty){
                                        movement-=4.0;
                                    }
                                    if(inTable(p,x-1,y+1) && p.board[x-1][y+1] == Position.Empty){
                                        movement-=4.0;
                                    }
                                    if(inTable(p,x+1,y-1) && p.board[x+1][y-1] == Position.Empty){
                                        movement-=4.0;
                                    }
                                }
				if(p.board[x][y] == Position.BKnight){
                                    points -= 2.4;
                                    ominousness-=ominousness(p,x,y);
                                    if(inTable(p,x+2,y-1) && p.board[x+2][y-1] == Position.Empty){
                                        movement-=2.4;
                                    }
                                    if(inTable(p,x+2,y+1) && p.board[x+2][y+1] == Position.Empty){
                                        movement-=2.4;
                                    }
                                    if(inTable(p,x-2,y-1) && p.board[x-2][y-1] == Position.Empty){
                                        movement-=2.4;
                                    }
                                    if(inTable(p,x-2,y+1) && p.board[x-2][y+1] == Position.Empty){
                                        movement-=2.4;
                                    }
                                    if(inTable(p,x-1,y+2) && p.board[x-1][y+2] == Position.Empty){
                                        movement-=2.4;
                                    }
                                    if(inTable(p,x+1,y-2) && p.board[x+1][y-2] == Position.Empty){
                                        movement-=2.4;
                                    }
                                    if(inTable(p,x-1,y+2) && p.board[x-1][y+2] == Position.Empty){
                                        movement-=2.4;
                                    }
                                    if(inTable(p,x+1,y+2) && p.board[x+1][y+2] == Position.Empty){
                                        movement-=2.4;
                                    }
                                }
				if(p.board[x][y] == Position.BPawn){
                                    points -= 1;
                                    ominousness-=ominousness(p,x,y);
                                    if(inTable(p,x,y+1) && p.board[x][y+1] == Position.Empty){
                                        movement-=1;
                                    }
                                    if(y+1==p.board[0].length){
                                        ominousness-=10.4;
                                    }
                                }
			}
		}
                ret = 8*points+2*ominousness+movement;
		return ret;
	}
    private boolean inTable(Position p, int x, int y){
        return (x<=p.board[0].length-1 && x>=0 && y<=p.board.length-1 && y>=0);
    }
    private double ominousness(Position p, int x, int y){
        double ominousness=0;
        int x1=x;
        int y1=y;
        switch(p.board[x][y]){
            case Position.Empty:
                ominousness=0;
                break;
            case Position.BKing:
                if(inTable(p,x+1,y) && pieceColor(p,x+1,y)==1){
                    ominousness+=Math.abs(pieceValue(p,x+1,y));
                }
                if(inTable(p,x-1,y) && pieceColor(p,x-1,y)==1){
                    ominousness+=Math.abs(pieceValue(p,x-1,y));
                }
                if(inTable(p,x,y+1) && pieceColor(p,x,y+1)==1){
                    ominousness+=Math.abs(pieceValue(p,x,y+1));
                }
                if(inTable(p,x,y-1) && pieceColor(p,x,y-1)==1){
                    ominousness+=Math.abs(pieceValue(p,x,y-1));
                }
                if(inTable(p,x+1,y+1) && pieceColor(p,x+1,y+1)==1){
                    ominousness+=Math.abs(pieceValue(p,x+1,y+1));
                }
                if(inTable(p,x-1,y-1) && pieceColor(p,x-1,y-1)==1){
                    ominousness+=Math.abs(pieceValue(p,x-1,y-1));
                }
                if(inTable(p,x-1,y+1) && pieceColor(p,x-1,y+1)==1){
                    ominousness+=Math.abs(pieceValue(p,x-1,y+1));
                }
                if(inTable(p,x+1,y-1) && pieceColor(p,x+1,y-1)==1){
                    ominousness+=Math.abs(pieceValue(p,x+1,y-1));
                }
                break;
            case Position.BQueen:
                while(inTable(p,x1+1,y1+1)){
                    x1++;
                    y1++;
                    if(pieceColor(p,x1,y1)==0){
                        break;
                    }
                    if(pieceColor(p,x1,y1)==1){
                        ominousness+=Math.abs(pieceValue(p,x1,y1));
                        break;
                    }
                }
                x1=x;
                y1=y;
                while(inTable(p,x1-1,y1-1)){
                    x1--;
                    y1--;
                    if(pieceColor(p,x1,y1)==0){
                        break;
                    }
                    if(pieceColor(p,x1,y1)==1){
                        ominousness+=Math.abs(pieceValue(p,x1,y1));
                        break;
                    }
                }
                x1=x;
                y1=y;
                while(inTable(p,x1-1,y1+1)){
                    x1--;
                    y1++;
                    if(pieceColor(p,x1,y1)==0){
                        break;
                    }
                    if(pieceColor(p,x1,y1)==1){
                        ominousness+=Math.abs(pieceValue(p,x1,y1));
                        break;
                    }
                }
                x1=x;
                y1=y;
                while(inTable(p,x1+1,y1-1)){
                    x1++;
                    y1--;
                    if(pieceColor(p,x1,y1)==0){
                        break;
                    }
                    if(pieceColor(p,x1,y1)==1){
                        ominousness+=Math.abs(pieceValue(p,x1,y1));
                        break;
                    }
                }
                x1=x;
                y1=y;
                while(inTable(p,x1-1,y1)){
                    x1--;
                    if(pieceColor(p,x1,y1)==0){
                        break;
                    }
                    if(pieceColor(p,x1,y1)==1){
                        ominousness+=Math.abs(pieceValue(p,x1,y1));
                        break;
                    }
                }
                x1=x;
                y1=y;
                while(inTable(p,x1+1,y1)){
                    x1++;
                    if(pieceColor(p,x1,y1)==0){
                        break;
                    }
                    if(pieceColor(p,x1,y1)==1){
                        ominousness+=Math.abs(pieceValue(p,x1,y1));
                        break;
                    }
                }
                x1=x;
                y1=y;
                while(inTable(p,x1,y1+1)){
                    y1++;
                    if(pieceColor(p,x1,y1)==0){
                        break;
                    }
                    if(pieceColor(p,x1,y1)==1){
                        ominousness+=Math.abs(pieceValue(p,x1,y1));
                        break;
                    }
                }
                x1=x;
                y1=y;
                while(inTable(p,x1,y1-1)){
                    y1--;
                    if(pieceColor(p,x1,y1)==0){
                        break;
                    }
                    if(pieceColor(p,x1,y1)==1){
                        ominousness+=Math.abs(pieceValue(p,x1,y1));
                        break;
                    }
                }
                break;
            case Position.BRook:
                while(inTable(p,x1,y1-1)){
                    y1--;
                    if(pieceColor(p,x1,y1)==0){
                        break;
                    }
                    if(pieceColor(p,x1,y1)==1){
                        ominousness+=Math.abs(pieceValue(p,x1,y1));
                        break;
                    }
                }
                x1=x;
                y1=y;
                while(inTable(p,x1,y1+1)){
                    y1++;
                    if(pieceColor(p,x1,y1)==0){
                        break;
                    }
                    if(pieceColor(p,x1,y1)==1){
                        ominousness+=Math.abs(pieceValue(p,x1,y1));
                        break;
                    }
                }
                x1=x;
                y1=y;
                while(inTable(p,x1-1,y1)){
                    x1--;
                    if(pieceColor(p,x1,y1)==0){
                        break;
                    }
                    if(pieceColor(p,x1,y1)==1){
                        ominousness+=Math.abs(pieceValue(p,x1,y1));
                        break;
                    }
                }
                x1=x;
                y1=y;
                while(inTable(p,x1+1,y1)){
                    x1++;
                    if(pieceColor(p,x1,y1)==0){
                        break;
                    }
                    if(pieceColor(p,x1,y1)==1){
                        ominousness+=Math.abs(pieceValue(p,x1,y1));
                        break;
                    }
                }
                break;
            case Position.BBishop:
                while(inTable(p,x1+1,y1+1)){
                    x1++;
                    y1++;
                    if(pieceColor(p,x1,y1)==0){
                        break;
                    }
                    if(pieceColor(p,x1,y1)==1){
                        ominousness+=Math.abs(pieceValue(p,x1,y1));
                        break;
                    }
                }
                x1=x;
                y1=y;
                while(inTable(p,x1+1,y1-1)){
                    x1--;
                    y1--;
                    if(pieceColor(p,x1,y1)==0){
                        break;
                    }
                    if(pieceColor(p,x1,y1)==1){
                        ominousness+=Math.abs(pieceValue(p,x1,y1));
                        break;
                    }
                }
                x1=x;
                y1=y;
                while(inTable(p,x1+1,y1-1)){
                    x1++;
                    y1--;
                    if(pieceColor(p,x1,y1)==0){
                        break;
                    }
                    if(pieceColor(p,x1,y1)==1){
                        ominousness+=Math.abs(pieceValue(p,x1,y1));
                        break;
                    }
                }
                x1=x;
                y1=y;
                while(inTable(p,x1-1,y1+1)){
                    x1--;
                    y1++;
                    if(pieceColor(p,x1,y1)==0){
                        break;
                    }
                    if(pieceColor(p,x1,y1)==1){
                        ominousness+=Math.abs(pieceValue(p,x1,y1));
                        break;
                    }
                }
                break;
            case Position.BKnight:
                if(inTable(p,x+2,y-1) && pieceColor(p,x+2,y-1)==1){
                    ominousness+=Math.abs(pieceValue(p,x+2,y-1));
                }
                if(inTable(p,x+2,y+1) && pieceColor(p,x+2,y+1)==1){
                    ominousness+=Math.abs(pieceValue(p,x+2,y+1));
                }
                if(inTable(p,x-2,y-1) && pieceColor(p,x-2,y-1)==1){
                    ominousness+=Math.abs(pieceValue(p,x-2,y-1));
                }
                if(inTable(p,x-2,y+1) && pieceColor(p,x-2,y+1)==1){
                    ominousness+=Math.abs(pieceValue(p,x-2,y+1));
                }
                if(inTable(p,x-1,y+2) && pieceColor(p,x-1,y+2)==1){
                    ominousness+=Math.abs(pieceValue(p,x-1,y+2));
                }
                if(inTable(p,x+1,y-2) && pieceColor(p,x+1,y-2)==1){
                    ominousness+=Math.abs(pieceValue(p,x+1,y-2));
                }
                if(inTable(p,x-1,y+2) && pieceColor(p,x-1,y+2)==1){
                    ominousness+=Math.abs(pieceValue(p,x-1,y+2));
                }
                if(inTable(p,x+1,y+2) && pieceColor(p,x+1,y+2)==1){
                    ominousness+=Math.abs(pieceValue(p,x+1,y+2));
                }
                break;
            case Position.BPawn:
                if(inTable(p,x+1,y+1) && pieceColor(p,x+1,y+1)==1){
                    ominousness+=Math.abs(pieceValue(p,x+1,y+1));
                }
                if(inTable(p,x+1,y-1) && pieceColor(p,x+1,y-1)==1){
                    ominousness+=Math.abs(pieceValue(p,x+1,y-1));
                }
                break;
            case Position.WKing:
                if(inTable(p,x+1,y) && pieceColor(p,x+1,y)==0){
                    ominousness+=Math.abs(pieceValue(p,x+1,y));
                }
                if(inTable(p,x-1,y) && pieceColor(p,x-1,y)==0){
                    ominousness+=Math.abs(pieceValue(p,x-1,y));
                }
                if(inTable(p,x,y+1) && pieceColor(p,x,y+1)==0){
                    ominousness+=Math.abs(pieceValue(p,x,y+1));
                }
                if(inTable(p,x,y-1) && pieceColor(p,x,y-1)==0){
                    ominousness+=Math.abs(pieceValue(p,x,y-1));
                }
                if(inTable(p,x+1,y+1) && pieceColor(p,x+1,y+1)==0){
                    ominousness+=Math.abs(pieceValue(p,x+1,y+1));
                }
                if(inTable(p,x-1,y-1) && pieceColor(p,x-1,y-1)==0){
                    ominousness+=Math.abs(pieceValue(p,x-1,y-1));
                }
                if(inTable(p,x-1,y+1) && pieceColor(p,x-1,y+1)==0){
                    ominousness+=Math.abs(pieceValue(p,x-1,y+1));
                }
                if(inTable(p,x+1,y-1) && pieceColor(p,x+1,y-1)==0){
                    ominousness+=Math.abs(pieceValue(p,x+1,y-1));
                }
                break;
            case Position.WQueen:
                while(inTable(p,x1+1,y1+1)){
                    x1++;
                    y1++;
                    if(pieceColor(p,x1,y1)==1){
                        break;
                    }
                    if(pieceColor(p,x1,y1)==0){
                        ominousness+=Math.abs(pieceValue(p,x1,y1));
                        break;
                    }
                }
                x1=x;
                y1=y;
                while(inTable(p,x1-1,y1-1)){
                    x1--;
                    y1--;
                    if(pieceColor(p,x1,y1)==1){
                        break;
                    }
                    if(pieceColor(p,x1,y1)==0){
                        ominousness+=Math.abs(pieceValue(p,x1,y1));
                        break;
                    }
                }
                x1=x;
                y1=y;
                while(inTable(p,x1-1,y1+1)){
                    x1--;
                    y1++;
                    if(pieceColor(p,x1,y1)==1){
                        break;
                    }
                    if(pieceColor(p,x1,y1)==0){
                        ominousness+=Math.abs(pieceValue(p,x1,y1));
                        break;
                    }
                }
                x1=x;
                y1=y;
                while(inTable(p,x1+1,y1-1)){
                    x1++;
                    y1--;
                    if(pieceColor(p,x1,y1)==1){
                        break;
                    }
                    if(pieceColor(p,x1,y1)==0){
                        ominousness+=Math.abs(pieceValue(p,x1,y1));
                        break;
                    }
                }
                x1=x;
                y1=y;
                while(inTable(p,x1-1,y1)){
                    x1--;
                    if(pieceColor(p,x1,y1)==1){
                        break;
                    }
                    if(pieceColor(p,x1,y1)==0){
                        ominousness+=Math.abs(pieceValue(p,x1,y1));
                        break;
                    }
                }
                x1=x;
                y1=y;
                while(inTable(p,x1+1,y1)){
                    x1++;
                    if(pieceColor(p,x1,y1)==1){
                        break;
                    }
                    if(pieceColor(p,x1,y1)==0){
                        ominousness+=Math.abs(pieceValue(p,x1,y1));
                        break;
                    }
                }
                x1=x;
                y1=y;
                while(inTable(p,x1,y1+1)){
                    y1++;
                    if(pieceColor(p,x1,y1)==1){
                        break;
                    }
                    if(pieceColor(p,x1,y1)==0){
                        ominousness+=Math.abs(pieceValue(p,x1,y1));
                        break;
                    }
                }
                x1=x;
                y1=y;
                while(inTable(p,x1,y1-1)){
                    y1--;
                    if(pieceColor(p,x1,y1)==1){
                        break;
                    }
                    if(pieceColor(p,x1,y1)==0){
                        ominousness+=Math.abs(pieceValue(p,x1,y1));
                        break;
                    }
                }
                break;
            case Position.WRook:
                while(inTable(p,x1,y1-1)){
                    y1--;
                    if(pieceColor(p,x1,y1)==1){
                        break;
                    }
                    if(pieceColor(p,x1,y1)==0){
                        ominousness+=Math.abs(pieceValue(p,x1,y1));
                        break;
                    }
                }
                x1=x;
                y1=y;
                while(inTable(p,x1,y1+1)){
                    y1++;
                    if(pieceColor(p,x1,y1)==1){
                        break;
                    }
                    if(pieceColor(p,x1,y1)==0){
                        ominousness+=Math.abs(pieceValue(p,x1,y1));
                        break;
                    }
                }
                x1=x;
                y1=y;
                while(inTable(p,x1-1,y1)){
                    x1--;
                    if(pieceColor(p,x1,y1)==1){
                        break;
                    }
                    if(pieceColor(p,x1,y1)==0){
                        ominousness+=Math.abs(pieceValue(p,x1,y1));
                        break;
                    }
                }
                x1=x;
                y1=y;
                while(inTable(p,x1+1,y1)){
                    x1++;
                    if(pieceColor(p,x1,y1)==1){
                        break;
                    }
                    if(pieceColor(p,x1,y1)==0){
                        ominousness+=Math.abs(pieceValue(p,x1,y1));
                        break;
                    }
                }
                break;
            case Position.WBishop:
                while(inTable(p,x1+1,y1+1)){
                    x1++;
                    y1++;
                    if(pieceColor(p,x1,y1)==1){
                        break;
                    }
                    if(pieceColor(p,x1,y1)==0){
                        ominousness+=Math.abs(pieceValue(p,x1,y1));
                        break;
                    }
                }
                x1=x;
                y1=y;
                while(inTable(p,x1+1,y1-1)){
                    x1--;
                    y1--;
                    if(pieceColor(p,x1,y1)==1){
                        break;
                    }
                    if(pieceColor(p,x1,y1)==0){
                        ominousness+=Math.abs(pieceValue(p,x1,y1));
                        break;
                    }
                }
                x1=x;
                y1=y;
                while(inTable(p,x1+1,y1-1)){
                    x1++;
                    y1--;
                    if(pieceColor(p,x1,y1)==1){
                        break;
                    }
                    if(pieceColor(p,x1,y1)==0){
                        ominousness+=Math.abs(pieceValue(p,x1,y1));
                        break;
                    }
                }
                x1=x;
                y1=y;
                while(inTable(p,x1-1,y1+1)){
                    x1--;
                    y1++;
                    if(pieceColor(p,x1,y1)==1){
                        break;
                    }
                    if(pieceColor(p,x1,y1)==0){
                        ominousness+=Math.abs(pieceValue(p,x1,y1));
                        break;
                    }
                }
                break;
            case Position.WKnight:
                if(inTable(p,x+2,y-1) && pieceColor(p,x+2,y-1)==0){
                    ominousness+=Math.abs(pieceValue(p,x+2,y-1));
                }
                if(inTable(p,x+2,y+1) && pieceColor(p,x+2,y+1)==0){
                    ominousness+=Math.abs(pieceValue(p,x+2,y+1));
                }
                if(inTable(p,x-2,y-1) && pieceColor(p,x-2,y-1)==0){
                    ominousness+=Math.abs(pieceValue(p,x-2,y-1));
                }
                if(inTable(p,x-2,y+1) && pieceColor(p,x-2,y+1)==0){
                    ominousness+=Math.abs(pieceValue(p,x-2,y+1));
                }
                if(inTable(p,x-1,y+2) && pieceColor(p,x-1,y+2)==0){
                    ominousness+=Math.abs(pieceValue(p,x-1,y+2));
                }
                if(inTable(p,x+1,y-2) && pieceColor(p,x+1,y-2)==0){
                    ominousness+=Math.abs(pieceValue(p,x+1,y-2));
                }
                if(inTable(p,x-1,y+2) && pieceColor(p,x-1,y+2)==0){
                    ominousness+=Math.abs(pieceValue(p,x-1,y+2));
                }
                if(inTable(p,x+1,y+2) && pieceColor(p,x+1,y+2)==0){
                    ominousness+=Math.abs(pieceValue(p,x+1,y+2));
                }
                break;
            case Position.WPawn:
                if(inTable(p,x-1,y+1) && pieceColor(p,x-1,y+1)==0){
                    ominousness+=Math.abs(pieceValue(p,x-1,y+1));
                }
                if(inTable(p,x-1,y-1) && pieceColor(p,x-1,y-1)==0){
                    ominousness+=Math.abs(pieceValue(p,x-1,y-1));
                }
                break;
        }
        return ominousness;
    }
    private double pieceValue(Position p, int x, int y){
        double value = 0;
        switch(p.board[x][y]){
            case Position.WKing:
                value=3.0;
                break;
            case Position.WQueen:
                value=10.4;
                break;
            case Position.WRook:
                value=6.4;
                break;
            case Position.WBishop:
                value=4.0;
                break;
            case Position.WKnight:
                value=2.4;
                break;
            case Position.WPawn:
                value=1.0;
                break;
            case Position.BKing:
                value=-3.0;
                break;
            case Position.BQueen:
                value=-10.4;
                break;
            case Position.BRook:
                value=-6.4;
                break;
            case Position.BBishop:
                value=-4.0;
                break;
            case Position.BKnight:
                value=-2.4;
                break;
            case Position.BPawn:
                value=-1.0;
                break;
        }
        return value;
    }
    private int pieceColor(Position p, int x, int y){
        int value = 0;
        switch(p.board[x][y]){
            case Position.WKing:
                value=1;
                break;
            case Position.WQueen:
                value=1;
                break;
            case Position.WRook:
                value=1;
                break;
            case Position.WBishop:
                value=1;
                break;
            case Position.WKnight:
                value=1;
                break;
            case Position.BKing:
                value=0;
                break;
            case Position.BQueen:
                value=0;
                break;
            case Position.BRook:
                value=0;
                break;
            case Position.BBishop:
                value=0;
                break;
            case Position.BKnight:
                value=0;
                break;
        }
        return value;
    }
}

