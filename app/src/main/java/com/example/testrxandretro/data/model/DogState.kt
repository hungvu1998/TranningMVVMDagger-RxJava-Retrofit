package com.example.testrxandretro.data.model

sealed class DogState {
    class Error(val error: Throwable) : DogState()
    class RandomDogRecieved(val image: String) : DogState()
    class SearchDogRecieved(val images: List<String>) : DogState()
    class BreedListAllRecieved(val breedObj: Any) : DogState()
    class SubDogRansomRecieved(val image: String) : DogState()
    class DownLoadImage(val image: ByteArray) : DogState()
}