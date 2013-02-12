/**
 * Copyright 2011-2013 Xeiam LLC.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.xeiam.xchart.demo.charts.line;

import com.xeiam.xchart.Chart;
import com.xeiam.xchart.LineChart;
import com.xeiam.xchart.SwingWrapper;
import com.xeiam.xchart.style.Series;
import com.xeiam.xchart.style.SeriesColor;
import com.xeiam.xchart.style.SeriesLineStyle;
import com.xeiam.xchart.style.SeriesMarker;

/**
 * Plots Hundreds of Series on One Plot
 */
public class LineChart10 implements ExampleChart {

  public static void main(String[] args) {

    ExampleChart exampleChart = new LineChart10();
    Chart chart = exampleChart.getChart();
    new SwingWrapper(chart).displayChart();
  }

  @Override
  public Chart getChart() {

    // Create Chart
    Chart chart = new LineChart(800, 600);

    // Customize Chart
    chart.setChartTitle("LineChart10");
    chart.setXAxisTitle("X");
    chart.setYAxisTitle("Y");
    chart.getStyleManager().setLegendVisible(false);

    for (int i = 0; i < 200; i++) {
      Series series = chart.addSeries("", new double[] { Math.random(), Math.random() }, new double[] { Math.random(), Math.random() });
      series.setLineColor(SeriesColor.BLUE);
      series.setLineStyle(SeriesLineStyle.SOLID);
      series.setMarker(SeriesMarker.CIRCLE);
      series.setMarkerColor(SeriesColor.BLUE);
    }

    return chart;
  }

}
