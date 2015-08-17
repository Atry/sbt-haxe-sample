package com.thoughtworks;

import flash.Lib;
import flash.display.Shape;
class MainFlash {
    static function main() {
        var stage = Lib.current.stage;

        // create a center aligned rounded gray square
        var shape = new Shape();
        shape.graphics.beginFill(0x333333);
        shape.graphics.drawRoundRect(0, 0, 100, 100, 10);
        shape.x = (stage.stageWidth - 100) / 2;
        shape.y = (stage.stageHeight - 100) / 2;

        stage.addChild(shape);
    }
}