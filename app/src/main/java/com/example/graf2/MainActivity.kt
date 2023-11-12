package com.example.graf2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.github.mikephil.charting.charts.BarChart
import com.github.mikephil.charting.data.BarData
import com.github.mikephil.charting.data.BarDataSet
import com.github.mikephil.charting.data.BarEntry
import com.github.mikephil.charting.utils.ColorTemplate

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val entries = ArrayList<BarEntry>()
        entries.add(BarEntry(38f, 0))
        entries.add(BarEntry(31f, 1))
        entries.add(BarEntry(35f, 2))
        entries.add(BarEntry(33f, 3))
        entries.add(BarEntry(38f, 4))
        entries.add(BarEntry(58f, 5))
        entries.add(BarEntry(80f, 6))
        entries.add(BarEntry(81f, 7))
        entries.add(BarEntry(69f, 8))
        entries.add(BarEntry(67f, 9))
        entries.add(BarEntry(56f, 10))
        entries.add(BarEntry(51f, 11))
        val dataset = BarDataSet(entries,"")

        val labels = ArrayList<String>()
        labels.add("January")
        labels.add("February")
        labels.add("March")
        labels.add("April")
        labels.add("May")
        labels.add("June")
        labels.add("July")
        labels.add("August")
        labels.add("September")
        labels.add("October")
        labels.add("November")
        labels.add("December")

        val chart = BarChart(this)
        setContentView(chart)
        dataset.setColors(ColorTemplate.COLORFUL_COLORS)
        val data = BarData(labels, dataset)
        chart.data = data

        chart.setDescription("Средняя количество осадков в СПб")
        chart.animateY(1000)
    }
}