package com.vodrex.mdb.ui.activities

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.vodrex.mdb.databinding.ActivityMovieDetailBinding
import com.vodrex.mdb.ui.viewmodel.MovieDetailViewModel
import org.koin.androidx.viewmodel.ext.android.viewModel
import android.net.Uri
import com.ensar.tmdbkotlin.utils.isNetworkAvailable
import com.vodrex.mdb.R


class MovieDetailActivity : AppCompatActivity(), View.OnClickListener {

    private val viewModel by viewModel<MovieDetailViewModel>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = DataBindingUtil.setContentView<ActivityMovieDetailBinding>(
            this@MovieDetailActivity, R.layout.activity_movie_detail
        )
        viewModel.getMovieDetails(intent.getIntExtra("movie_id",0).toLong())

        if (isNetworkAvailable()){
            viewModel.getTrailers(intent.getIntExtra("movie_id",0).toLong())
        }

        binding.viewModel = viewModel
        binding.listener = this
    }

    override fun onClick(v: View?) {
        playYoutubeTrailer(viewModel.trailerId.get()?: "")
    }

    private fun playYoutubeTrailer(id: String) {
        val webIntent = Intent(Intent.ACTION_VIEW, Uri.parse("http://www.youtube.com/watch?v=$id"))
        startActivity(webIntent)
    }

}
