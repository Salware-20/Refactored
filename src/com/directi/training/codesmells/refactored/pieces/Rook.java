package com.directi.training.codesmells.refactored.pieces;

import com.directi.training.codesmells.refactored.Color;
import com.directi.training.codesmells.refactored.chess.MoveUtil;
import com.directi.training.codesmells.refactored.Position;

public class Rook extends Piece
{
    public Rook(Color color)
    {
        super(color);
    }

    public boolean isValidMove(Position from, Position to)
    {
        return MoveUtil.isHorizontalOrVerticalMove(from, to);
    }

    @Override
    public String toString()
    {
        return "r";
    }
}