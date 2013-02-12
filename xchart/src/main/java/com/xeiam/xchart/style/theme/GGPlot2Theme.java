/**
 * Copyright (C) 2013 Xeiam LLC http://xeiam.com
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a copy of
 * this software and associated documentation files (the "Software"), to deal in
 * the Software without restriction, including without limitation the rights to
 * use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies
 * of the Software, and to permit persons to whom the Software is furnished to do
 * so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package com.xeiam.xchart.style.theme;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Stroke;

import com.xeiam.xchart.style.ChartColor;
import com.xeiam.xchart.style.StyleManager.LegendPosition;

/**
 * @author timmolter
 */
public class GGPlot2Theme implements Theme {

  // Chart Style ///////////////////////////////

  @Override
  public Color getChartBackgroundColor() {

    return ChartColor.getAWTColor(ChartColor.WHITE);
  }

  @Override
  public Color getChartFontColor() {

    return ChartColor.getAWTColor(ChartColor.BLACK);
  }

  @Override
  public int getChartPadding() {

    return 10;
  }

  // Chart Title ///////////////////////////////

  @Override
  public Font getChartTitleFont() {

    return new Font(Font.SANS_SERIF, Font.PLAIN, 14);
  }

  @Override
  public boolean isChartTitleVisible() {

    return false;
  }

  @Override
  public Color getChartTitleBackgroundColor() {

    return ChartColor.getAWTColor(ChartColor.GREY);
  }

  @Override
  public Color getChartTitleBorderColor() {

    return ChartColor.getAWTColor(ChartColor.GREY);
  }

  @Override
  public int getChartTitlePadding() {

    return 5;
  }

  // Chart Legend ///////////////////////////////

  @Override
  public Font getLegendFont() {

    return new Font(Font.SANS_SERIF, Font.PLAIN, 14);
  }

  @Override
  public boolean isLegendVisible() {

    return true;
  }

  @Override
  public Color getLegendBackgroundColor() {

    return ChartColor.getAWTColor(ChartColor.WHITE);
  }

  @Override
  public Color getLegendBorderColor() {

    return ChartColor.getAWTColor(ChartColor.WHITE);
  }

  @Override
  public int getLegendPadding() {

    return 10;
  }

  @Override
  public LegendPosition getLegendPosition() {

    return LegendPosition.OutsideW;
  }

  // Chart Axes ///////////////////////////////

  @Override
  public boolean isXAxisTitleVisible() {

    return false;
  }

  @Override
  public boolean isYAxisTitleVisible() {

    return false;
  }

  @Override
  public Font getAxisTitleFont() {

    return new Font(Font.SANS_SERIF, Font.PLAIN, 14);
  }

  @Override
  public boolean isXAxisTicksVisible() {

    return true;
  }

  @Override
  public boolean isYAxisTicksVisible() {

    return true;
  }

  @Override
  public Font getAxisTickLabelsFont() {

    return new Font(Font.SANS_SERIF, Font.BOLD, 13);
  }

  @Override
  public int getAxisTickMarkLength() {

    return 8;
  }

  @Override
  public int getAxisTickPadding() {

    return 5;
  }

  @Override
  public boolean isAxisTicksLineVisible() {

    return false;
  }

  @Override
  public int getPlotPadding() {

    return 0;
  }

  @Override
  public Color getAxisTickMarksColor() {

    return ChartColor.getAWTColor(ChartColor.DARK_GREY);

  }

  @Override
  public Stroke getAxisTickMarksStroke() {

    return new BasicStroke(1.5f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);
  }

  @Override
  public Color getAxisTickLabelsColor() {

    return ChartColor.getAWTColor(ChartColor.DARK_GREY);
  }

  @Override
  public int getAxisTitlePadding() {

    return 10;
  }

  // Chart Plot Area ///////////////////////////////

  @Override
  public boolean isPlotGridLinesVisible() {

    return true;
  }

  @Override
  public Color getPlotBackgroundColor() {

    return ChartColor.getAWTColor(ChartColor.LIGHT_GREY);
  }

  @Override
  public Color getPlotBorderColor() {

    return ChartColor.getAWTColor(ChartColor.WHITE);
  }

  @Override
  public boolean isPlotBorderVisible() {

    return false;
  }

  @Override
  public Color getPlotGridLinesColor() {

    return ChartColor.getAWTColor(ChartColor.WHITE);
  }

  @Override
  public Stroke getPlotGridLinesStroke() {

    return new BasicStroke(1.5f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);
  }

  // Error Bars ///////////////////////////////

  @Override
  public Color getErrorBarsColor() {

    return ChartColor.getAWTColor(ChartColor.DARK_GREY);
  }

}
