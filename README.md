# YouTube Split [![License: GPL v3](https://img.shields.io/badge/License-GPLv3-blue.svg)](https://www.gnu.org/licenses/gpl-3.0)
YouTube Split is an application for ripping full-length albums off youtube
![Initial View](https://i.imgur.com/CEY0Jkp.png)

The program works by downloading the description of a video.
If the video has timestamps in the description paired with song names, YouTube Split can read this data.
The program pattern matches the description:

Example Pattern:
```{TIMESTAMP} {ARTIST} - {SONG}``` matches ```3:01 The Beatles - With a Little Help From my Friends```


![Tracks](https://i.imgur.com/0r2Gfn5.png)

A track listing is automatically generated by the program. Track titles, artists, and album names can be edited next.
The cover art can also be changed. The user must then select an audio format and bitrate to save as, along with a target directory.

![Output](https://i.imgur.com/rZX9ZHj.png)

Finally, after hitting download, the program outputs each song to the target folder as separate files. 
Each of the filenames are fully formatted and each file comes with metadata info along with cover art.
This means that other programs and devices can recognize these music files.

## License

<a href="https://www.gnu.org/licenses/gpl-3.0"><img src="https://upload.wikimedia.org/wikipedia/commons/9/93/GPLv3_Logo.svg" alt="GPLv3 license" width=200></a>

YouTube-Split is licensed under the GNU General Public License v3.0, also included in this repository in the LICENSE file.
