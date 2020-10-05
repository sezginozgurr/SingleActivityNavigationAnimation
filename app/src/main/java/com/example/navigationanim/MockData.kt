package com.example.navigationanim

import com.example.navigationanim.recycler1.MyChildModel
import com.example.navigationanim.recycler2.AnimalsModel

object MockData {
    fun getPhotoList(): ArrayList<MyChildModel> {
        val eduPhoto = MyChildModel(R.drawable.ic_launcher_background, "AAAAA")
        val eduPhoto1 = MyChildModel(R.drawable.ic_launcher_background, "BBBBBB")
        val eduPhoto2 = MyChildModel(R.drawable.ic_launcher_background, "CCCCCC")

        val myPhotoList: ArrayList<MyChildModel> = ArrayList()
        myPhotoList.add(eduPhoto)
        myPhotoList.add(eduPhoto1)
        myPhotoList.add(eduPhoto2)

        return myPhotoList
    }

    fun getAnimals(): ArrayList<AnimalsModel> {
        val animMod = AnimalsModel(
            "https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcTff6T5i0nBMFX_GYBNpT8rf64vRZxNckvTyg&usqp=CAU",
            "Hayvan1",
            "AAAAA"
        )
        val animMod1 = AnimalsModel(
            "https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcSQ9GOQTW0pAKqzUiDa8ZQBenIvh6cX0VgN4w&usqp=CAU",
            "Hayvan2",
            "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum."
        )
        val animMod2 = AnimalsModel(
            "https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcSZ4Tau3PfxV0MKcXD4_Ow_siTP55tnceWcjg&usqp=CAU",
            "Hayvan3",
            "Where does it come from?\n" +
                    "Contrary to popular belief, Lorem Ipsum is not simply random text. It has roots in a piece of classical Latin literature from 45 BC, making it over 2000 years old. Richard McClintock, a Latin professor at Hampden-Sydney College in Virginia, looked up one of the more obscure Latin words, consectetur, from a Lorem Ipsum passage, and going through the cites of the word in classical literature, discovered the undoubtable source. Lorem Ipsum comes from sections 1.10.32 and 1.10.33 of \"de Finibus Bonorum et Malorum\" (The Extremes of Good and Evil) by Cicero, written in 45 BC. This book is a treatise on the theory of ethics, very popular during the Renaissance. The first line of Lorem Ipsum, \"Lorem ipsum dolor sit amet..\", comes from a line in section 1.10.32.\n" +
                    "\n" +
                    "The standard chunk of Lorem Ipsum used since the 1500s is reproduced below for those interested. Sections 1.10.32 and 1.10.33 from \"de Finibus Bonorum et Malorum\" by Cicero are also reproduced in their exact original form, accompanied by English versions from the 1914 translation by H. Rackham."
        )
        val animMod3 = AnimalsModel(
            "https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcRWFENdRimRmAWDMM2F_gDWsNcaswda1H2fhQ&usqp=CAU",
            "Hayvan4",
            "Where can I get some?\n" +
                    "There are many variations of passages of Lorem Ipsum available, but the majority have suffered alteration in some form, by injected humour, or randomised words which don't look even slightly believable. If you are going to use a passage of Lorem Ipsum, you need to be sure there isn't anything embarrassing hidden in the middle of text. All the Lorem Ipsum generators on the Internet tend to repeat predefined chunks as necessary, making this the first true generator on the Internet. It uses a dictionary of over 200 Latin words, combined with a handful of model sentence structures, to generate Lorem Ipsum which looks reasonable. The generated Lorem Ipsum is therefore always free from repetition, injected humour, or non-characteristic words etc."
        )
        val animMod4 = AnimalsModel(
            "https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcSwqeEqm3zYCpHZpkFzJso65koXOSZItlFI_A&usqp=CAU",
            "Hayvan5",
            "Why do we use it?\n" +
                    "It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout. The point of using Lorem Ipsum is that it has a more-or-less normal distribution of letters, as opposed to using 'Content here, content here', making it look like readable English. Many desktop publishing packages and web page editors now use Lorem Ipsum as their default model text, and a search for 'lorem ipsum' will uncover many web sites still in their infancy. Various versions have evolved over the years, sometimes by accident, sometimes on purpose (injected humour and the like)."
        )

        val myAnimList: ArrayList<AnimalsModel> = ArrayList()
        myAnimList.add(animMod)
        myAnimList.add(animMod1)
        myAnimList.add(animMod2)
        myAnimList.add(animMod3)
        myAnimList.add(animMod4)

        return myAnimList
    }
}