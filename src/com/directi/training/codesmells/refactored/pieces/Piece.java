package com.directi.training.codesmells.refactored.pieces;

import com.directi.training.codesmells.refactored.Color;
import com.directi.training.codesmells.refactored.Position;

public abstract class Piece
{
    private Color color;

    public Piece(Color color)
    {
        this.color = color;
    }

    public Color getColor()
    {
        return color;
    }

    public abstract boolean isValidMove(Position from, Position to);
}